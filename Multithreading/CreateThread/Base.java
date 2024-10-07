package Multithreading.CreateThread;

public class Base {
    public static void main(String[] args) {
        System.out.println("Hello World");

        World world = new World();
        world.start();

        // it will return the name of current thread name.
        for (;;) {
            System.out.println(Thread.currentThread().getName());

        }
    }
}
