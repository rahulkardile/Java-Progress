public class ThreadMethods extends Thread {

    public ThreadMethods(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i <= 5; i++) {
            String a = "";
            for (double j = 0; j <= 10000; j++) {
                a += "a";
            }

            System.out.println(Thread.currentThread().getName() + "\t" + "Priority : "
                    + Thread.currentThread().getPriority() + "\t" + "Count : " + i);
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMethods l = new ThreadMethods("Thread Low Priority");
        ThreadMethods m = new ThreadMethods("Thread Medium Priority");
        ThreadMethods h = new ThreadMethods("Thread High Priority");

        l.setPriority(MIN_PRIORITY);
        m.setPriority(NORM_PRIORITY);
        h.setPriority(MAX_PRIORITY);

        // These join will stop unti that thread complete its execution.
        l.start();
        // l.join(); // it will wait to complete it task.
        m.start();
        // m.join();
        h.start();
        // h.join();

    }
}

// Intrupt

class NewMethod extends Thread {

    public NewMethod(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("Thread " + Thread.currentThread().getName() + " is running!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        NewMethod t1 = new NewMethod("Thread Intrupt");
        t1.start();
        t1.interrupt();

    }

}

// Yeild 
// a way to give change to another threads
class Yeild extends Thread {

    @Override
    public void run() {
        try {
        
            for (int i = 0; i < 10; i++) {
                System.out.println("executing " + Thread.currentThread().getName());
                Thread.yield();    
            }
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Yeild t1 = new Yeild();
        Yeild t2 = new Yeild();

        t1.start();
        t2.start();

    }

}
