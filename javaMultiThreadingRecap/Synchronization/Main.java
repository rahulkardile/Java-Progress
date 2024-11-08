package Synchronization;

public class Main {
    public static void main(String[] args) {
        
        Counter counter = new Counter();
        
        MyThreads t1 = new MyThreads(counter);
        MyThreads t2 = new MyThreads(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(counter.getCount());

    }
}

class MyThreads extends Thread {
    
    private Counter counter;

    public MyThreads(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            counter.increament();
        }
    }

}