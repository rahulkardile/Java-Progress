package Locks;

public class Main {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run(){
                try {
                    account.withdraw(50);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");

        t1.start();
        t2.start();


    }
}
