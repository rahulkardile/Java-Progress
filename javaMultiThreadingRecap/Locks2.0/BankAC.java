import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAC {
    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {

        System.out.println(Thread.currentThread().getName() + " Attempting to withdraw " + amount);

        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {

                    System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");

                    try {

                        Thread.sleep(10000);

                    } catch (Exception e) {
                    } finally {
                        lock.unlock();
                    }

                    balance -= amount;
                    System.out.println("completed withdrawal. remaining balance " + balance);

                } else {
                    System.out.println(Thread.currentThread().getName() + " insuffient balance.");
                }
            } else {
                System.out.println(
                        Thread.currentThread().getName() + " Could not accuire the lock will try again leter....");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
