import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Main extends JFrame {
    // HashMap to store user credentials
    private HashMap<String, String> users = new HashMap<>();

    public Main(){
        setTitle("Login And Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 350);
        setLocationRelativeTo(null);

        // Set Background to content panel
        getContentPane().setBackground(new Color(45, 45, 45));

        // creating card to switch between login and registration.
        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(34, 32, 53));

        // styling components
        Color bgColor = new Color(60, 63, 65);
        Color fgColor = new Color(60, 63, 65);
        Color btnColor = new Color(60, 63, 65);
        Font font = new Font("Arial", Font.PLAIN, 14);

        // rounded border for input
        Border roundedBorder = new LineBorder(new Color(200, 200, 200), 1, true);

        // login part
        JPanel loginPanel = new JPanel(new GridBagLayout());
        loginPanel.setBackground(bgColor);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel userLable = new JLabel("Username : ");
        userLable.setForeground(fgColor);
        userLable.setFont(font);

        JTextField userName = new JTextField();
        userName.setBorder(roundedBorder);
        userName.setPreferredSize(new Dimension(200, 30));

        JLabel password = new JLabel("Password : ");
        password.setFont(font);
        password.setForeground(fgColor);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBorder(roundedBorder);
        passwordField.setPreferredSize(new Dimension(200, 30));

        JButton loginBtn = new JButton("Login");
        loginBtn.setFocusPainted(false);
        loginBtn.setBackground(bgColor);
        loginBtn.setForeground(fgColor);
        loginBtn.setPreferredSize(new Dimension(100, 30));

        JButton switchToRegister = new JButton("Register");
        switchToRegister.setFocusPainted(false);
        switchToRegister.setForeground(fgColor);
        switchToRegister.setBackground(bgColor);
        switchToRegister.setPreferredSize(new Dimension(100, 30));

        gbc.gridx = 0;
        gbc.gridy = 0;
        loginPanel.add(userLable, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        loginPanel.add(userName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        loginPanel.add(password, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        loginPanel.add(passwordField);

        gbc.gridx = 0;
        gbc.gridy = 2;
        loginPanel.add(loginBtn, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        loginPanel.add(switchToRegister, gbc);

        // register panel
        JPanel registerPanel = new JPanel(new GridBagLayout());
        registerPanel.setBackground(bgColor);

        JLabel regUserLable = new JLabel("Register username : ");
        regUserLable.setForeground(fgColor);
        regUserLable.setFont(font);

        JTextField regUsernameField = new JTextField();
        regUsernameField.setBorder(roundedBorder);
        regUsernameField.setPreferredSize(new Dimension(200, 30));

        JLabel regPasswordLable = new JLabel("Password : ");
        regPasswordLable.setForeground(fgColor);
        regPasswordLable.setFont(font);

        JPasswordField regPasswordField = new JPasswordField();
        regPasswordField.setBorder(roundedBorder);
        regPasswordField.setPreferredSize(new Dimension(200, 30));

        JButton registerButton = new JButton("Register");
        registerButton.setBackground(btnColor);
        registerButton.setForeground(fgColor);
        registerButton.setFocusPainted(false);
        registerButton.setPreferredSize(new Dimension(100, 30));

        JButton switchToLogin = new JButton("Login");
        switchToLogin.setBackground(btnColor);
        switchToLogin.setForeground(fgColor);
        switchToLogin.setFocusPainted(false);
        switchToLogin.setPreferredSize(new Dimension(100, 30));

        gbc.gridx = 0;
        gbc.gridy = 0;
        registerPanel.add(regUserLable, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        registerPanel.add(regUsernameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        registerPanel.add(regPasswordLable, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        registerPanel.add(regPasswordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        registerPanel.add(registerButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        registerPanel.add(switchToLogin, gbc);

        // Add login and registration panels to the main panel
        mainPanel.add(loginPanel, "Login");
        mainPanel.add(registerPanel, "Register");

        // Switch to Registration Panel
        switchToRegister.addActionListener(e -> cardLayout.show(mainPanel, "Register"));

        // Switch to Login Panel
        switchToLogin.addActionListener(e -> cardLayout.show(mainPanel, "Login"));

        // handle login
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userName.getText();
                String password = new String(passwordField.getPassword());

                if(users.containsKey(username) &&  users.get(username).equals(password)){
                    JOptionPane.showMessageDialog(loginPanel, "Login Success!");
                }else{
                    JOptionPane.showMessageDialog(loginPanel, "Invalid Credencials, Please try again.");
                }

            }
        });

        // handle registration
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = regUsernameField.getText();
                String password = new String(regPasswordField.getPassword());

                if(username.isEmpty() || password.isEmpty()){
                    JOptionPane.showMessageDialog(registerPanel,"Username or password can not be Empty");
                }else if(users.containsKey(username)){
                    JOptionPane.showMessageDialog(registerPanel, "User already exists!");
                }else{
                    users.put(username, password);
                    JOptionPane.showMessageDialog(registerPanel,"Registration success!");
                    cardLayout.show(mainPanel, "Login");
                }
            }
        });

        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
            SwingUtilities.invokeLater(()-> new Main());
        }
    }
