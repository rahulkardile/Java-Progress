package Multithreading.LifeCycle;

public class ThreadLife extends Thread {

    @Override 
    public void run(){

    }

    public static void main(String[] args) {
        
        ThreadLife t1 = new ThreadLife();
        System.out.println(t1.getState());

    }
}
