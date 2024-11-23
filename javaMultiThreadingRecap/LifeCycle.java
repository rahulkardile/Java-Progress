// In This will explores all the the lifecycle of a thread

public class LifeCycle extends Thread {

    @Override
    public void run() { //3. Running state 
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        LifeCycle t1 = new LifeCycle();
        System.out.println(t1.getState()); //1. New State

        t1.start();
        System.out.println(t1.getState());  //2. Runnable State
  
        Thread.sleep(100);

        System.out.println(t1.getState()); // 4. time Waiting State

        t1.join(); // it will wait to complete the execution of the t1 and then move forward.

        System.out.println(t1.getState());  // 5. Terminated

    }
}
