package Synchronization;

class Counter {
    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}

class MyThread extends Thread {
    private Counter counter;
    public MyThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        for(int i = 0; i < 1000; i++){
            counter.increment();
        }
    }

}

public class Main {

    public static void main(String[] args) {
        Counter count = new Counter();
        MyThread t1 = new MyThread(count);
        MyThread t2 = new MyThread(count);

        t1.start();
        t2.start();
    
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(count.getCount());
    }
}
