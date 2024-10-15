package Interrupt;

import java.beans.IntrospectionException;

class Test extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread is running . . . ");
        } catch (Exception e) {
            System.out.println("Thread interupted : " + e.getMessage());
        }
    }
}

// Yield Thread.

class YieldT extends Thread {

    YieldT(String name){
        super(name);
    }
    
    @Override
    public void run(){
        for(int i = 0; i< 10; i++){
            System.out.println(Thread.currentThread().getName() + "\t I : " + i);
            Thread.yield();
        }
    }
}

public class Base {
    public static void main(String[] args) {
        // Test t1 = new Test();
        // t1.start();
        // t1.interrupt();

        YieldT yieldT = new YieldT("Thread 1");
        YieldT yieldT2 = new YieldT("Thread 2");

        yieldT.start();
        yieldT2.start();


    }
}
