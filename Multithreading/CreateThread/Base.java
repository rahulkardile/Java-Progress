package Multithreading.CreateThread;

public class Base {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // for extends thread
        // World world = new World();
        // world.start();

        World world = new World();
        Thread t1 = new Thread(world);

        t1.start();

        // it will return the name of current thread name.
        for (;;) {
            System.out.println(Thread.currentThread().getName());

        }
    }
}
