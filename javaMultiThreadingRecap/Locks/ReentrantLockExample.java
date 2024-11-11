package Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// explample of dead lock prevention.

public class ReentrantLockExample {

    private final Lock lock = new ReentrantLock();
    
    private void outerMethod(){
        lock.lock();
        try {
            System.out.println("Outer method!");
            innerMethod();            
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock();
        try {
            System.out.println("Inner Method!");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockExample example = new ReentrantLockExample();
        example.outerMethod();
    }
}
