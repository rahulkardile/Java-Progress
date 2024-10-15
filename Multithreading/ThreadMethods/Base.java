package Multithreading.ThreadMethods;

class A extends Thread {
    
    @Override
    public void run(){
        for(int i = 0; i <5; i++){
            try {
                Thread.sleep(2000);
                System.out.println(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class Base {

    public static void main(String[] args) throws Exception {
        A a1 = new A();
        a1.start();

        // main method waits for the previos thread.
        a1.join();

        System.out.println("Hello World . . . ");
    }

}
