package Multithreading.CreateThread;

// public class World extends Thread {
//     @Override 
//     public void run(){
//         for(; ;){
//             System.out.println(Thread.currentThread().getName());
//         }
//     }
// }

public class World implements Runnable {
    @Override 
    public void run(){
        for(; ;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}