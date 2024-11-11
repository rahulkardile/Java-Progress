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

            // this method will tell other methods to wait until the execution of the current task to finish.
            // lock.lock();

            // this method wait unit bellow time completes and still the task has't complete then it will exit or go into the else block.
            if (lock.tryLock(2, TimeUnit.SECONDS)) {

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

            } else {
                System.out.println(Thread.currentThread().getName() + " Could not acquire the lock, will try later.");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }

    }

}
