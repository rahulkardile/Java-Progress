package SetPriorityThread;

class A extends Thread {
    A(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            
            String a = "";

            for (int j = 0; j < 100000; j++) {
                a += "a";
            }

            System.out.println(Thread.currentThread().getName() + "\t - Priority : "
                    + Thread.currentThread().getPriority() + "\t - Count : " + i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }

        }
    }

}

public class Main {
    public static void main(String[] args) {

        A l = new A("Low Priority Thread");
        A m = new A("Medium Priority Thread");
        A h = new A("High Priority Thread");

        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);

        l.start();
        m.start();
        h.start();

    }
}
