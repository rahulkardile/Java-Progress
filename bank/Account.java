package bank;

public class Account {
    private double balance;

    public Account(int accontNumber, double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws Exception{
        if(amount > balance){
            throw new Exception("Insufficient Balance");
        }

        balance -= amount;
    }

    public double getBalance(){
        return balance;
    }

}
