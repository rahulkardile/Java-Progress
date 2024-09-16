package bank;

import java.io.File;
import java.io.FileWriter;

class User {
    private String name, user_id, password;
    private Account account;

    User(String name, String user_id, String password, Account account) {
        this.name = name;
        this.user_id = user_id;
        this.password = password;
        this.account = account;

        try {
            FileWriter userWritter = new FileWriter("Users.txt", true);
            userWritter.append("UserName : " + this.name + '\n' + "Password : " + this.password + '\n' + "Money : "
                    + account.getBalance());
            userWritter.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    // getter methods
    public String getUserId() {
        return this.user_id;
    }

    public String name() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public Account getAccount() {
        return this.account;
    }

    // Setters
    public void setUserId(String userId) {
        this.user_id = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

public class Bank {

    public void transfer(Account sender, Account receiver, double amount) throws Exception {
        sender.withdraw(amount);
        receiver.deposit(amount);
    }

    public static void main(String[] args) {
        Account account = new Account(214571, 25000000);

        User user1 = new User("Rahul Kardile", "1", "1234567", account);

        account.getBalance();

    }
}
