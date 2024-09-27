package Applet;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginApp {
    // HashMap to store user credentials
    private HashMap<String, String> users = new HashMap<>();

    // Constructor to create the GUI
    public LoginApp() {
        // Create the main frame
        JFrame frame = new JFrame("Login and Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 350);
        frame.setLocationRelativeTo(null);

        // Set background color
        frame.getContentPane().setBackground(new Color(45, 45, 45));

        // Create a card layout to switch between login and registration
        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);
        mainPanel.setBackground(new Color(45, 45, 45));

        // Styling components
        Color bgColor = new Color(60, 63, 65);
        Color fgColor = new Color(255, 255, 255);
        Color buttonColor = new Color(0, 122, 204);
        Font font = new Font("Arial", Font.PLAIN, 14);

        // Create a rounded border for input fields
        Border roundedBorder = new LineBorder(new Color(200, 200, 200), 1, true);

        // Login panel
        JPanel loginPanel = new JPanel(new GridBagLayout());
        loginPanel.setBackground(bgColor);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        JLabel userLabel = new JLabel("Username:");
        userLabel.setForeground(fgColor);
        userLabel.setFont(font);
        
        JTextField userField = new JTextField();
        userField.setBorder(roundedBorder);
        userField.setPreferredSize(new Dimension(200, 30));

        JLabel passLabel = new JLabel("Password:");
        passLabel.setForeground(fgColor);
        passLabel.setFont(font);
        
        JPasswordField passField = new JPasswordField();
        passField.setBorder(roundedBorder);
        passField.setPreferredSize(new Dimension(200, 30));
        
        JButton loginButton = new JButton("Login");
        loginButton.setBackground(buttonColor);
        loginButton.setForeground(fgColor);
        loginButton.setFocusPainted(false);
        loginButton.setPreferredSize(new Dimension(100, 30));

        JButton switchToRegister = new JButton("Register");
        switchToRegister.setBackground(buttonColor);
        switchToRegister.setForeground(fgColor);
        switchToRegister.setFocusPainted(false);
        switchToRegister.setPreferredSize(new Dimension(100, 30));

        gbc.gridx = 0;
        gbc.gridy = 0;
        loginPanel.add(userLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        loginPanel.add(userField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        loginPanel.add(passLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        loginPanel.add(passField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        loginPanel.add(loginButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        loginPanel.add(switchToRegister, gbc);

        // Registration panel
        JPanel registerPanel = new JPanel(new GridBagLayout());
        registerPanel.setBackground(bgColor);

        JLabel regUserLabel = new JLabel("Username:");
        regUserLabel.setForeground(fgColor);
        regUserLabel.setFont(font);

        JTextField regUserField = new JTextField();
        regUserField.setBorder(roundedBorder);
        regUserField.setPreferredSize(new Dimension(200, 30));

        JLabel regPassLabel = new JLabel("Password:");
        regPassLabel.setForeground(fgColor);
        regPassLabel.setFont(font);

        JPasswordField regPassField = new JPasswordField();
        regPassField.setBorder(roundedBorder);
        regPassField.setPreferredSize(new Dimension(200, 30));

        JButton registerButton = new JButton("Register");
        registerButton.setBackground(buttonColor);
        registerButton.setForeground(fgColor);
        registerButton.setFocusPainted(false);
        registerButton.setPreferredSize(new Dimension(100, 30));

        JButton switchToLogin = new JButton("Login");
        switchToLogin.setBackground(buttonColor);
        switchToLogin.setForeground(fgColor);
        switchToLogin.setFocusPainted(false);
        switchToLogin.setPreferredSize(new Dimension(100, 30));

        gbc.gridx = 0;
        gbc.gridy = 0;
        registerPanel.add(regUserLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        registerPanel.add(regUserField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        registerPanel.add(regPassLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        registerPanel.add(regPassField, gbc);

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

        // Handle login logic
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                if (users.containsKey(username) && users.get(username).equals(password)) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Credentials, Please try again.");
                }
            }
        });

        // Handle registration logic
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = regUserField.getText();
                String password = new String(regPassField.getPassword());

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Username and Password cannot be empty!");
                } else if (users.containsKey(username)) {
                    JOptionPane.showMessageDialog(frame, "Username already exists!");
                } else {
                    users.put(username, password);
                    JOptionPane.showMessageDialog(frame, "Registration Successful! Please Login.");
                    cardLayout.show(mainPanel, "Login");
                }
            }
        });

        // Add main panel to the frame
        frame.add(mainPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(() -> new LoginApp());
    }
}
