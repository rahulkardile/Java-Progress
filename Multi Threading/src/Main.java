
public class Main extends Thread {

    @Override
    public void run() {
        System.out.println("Running . . . ");  // Running State
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Main t1 = new Main();

        System.out.println(t1.getState());  // New State

        t1.start();

        System.out.println(t1.getState());  // RUNNABLE State

        Thread.sleep(100);

        System.out.println(t1.getState()); //TIMED_WAITING

        t1.join(); // waits untill t1 completes its execution

        System.out.println(t1.getState());  // TERMINATED

    }
}