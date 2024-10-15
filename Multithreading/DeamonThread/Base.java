package DeamonThread;

public class Base extends Thread {

    @Override 
    public void run(){
        while (true) {
        System.out.println("Hello World . . . ");
        }
    }

    public static void main(String[] args) {
        Base b1 = new Base();
        b1.setDaemon(true);
        b1.start();
        System.out.println("Main Done!");
    }
}
