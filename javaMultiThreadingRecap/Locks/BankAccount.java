package Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    Lock lock = new ReentrantLock();

    public void withdraw(int amount) throws Exception {
        System.out.println(Thread.currentThread().getName() + "\t" + "Attempting to withdraw : " + amount);

        try {
            lock.lock();
            if (lock.tryLock(3, TimeUnit.SECONDS)) {

                if (balance >= amount) {

                    try {

                        System.out.println(Thread.currentThread().getName() + "\tProceeding with withdrawal");
                        Thread.sleep(3000);
                        balance -= amount;

                        System.out.println("Withdrawal is completed!");
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }

                } else {
                    System.out.println(Thread.currentThread().getName() + "Insufficient fund!");
                }

            }else{
                System.out.println(Thread.currentThread().getName() + " Could not acquire the lock, will try later.");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }

    }

}
