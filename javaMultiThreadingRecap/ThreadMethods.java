public class ThreadMethods extends Thread {

    public ThreadMethods(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i = 0; i <= 5; i++){
            String a = "";
            for(double j = 0; j <= 10000; j++){
                a += "a";
            }
            
            System.out.println(Thread.currentThread().getName() + "\t" + "Priority : " + Thread.currentThread().getPriority() + "\t" + "Count : " + i);
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ThreadMethods l = new ThreadMethods("Thread Low Priority");
        ThreadMethods m = new ThreadMethods("Thread Medium Priority");
        ThreadMethods h = new ThreadMethods("Thread High Priority");

        l.setPriority(MIN_PRIORITY);
        m.setPriority(NORM_PRIORITY);
        h.setPriority(MAX_PRIORITY);

        l.start();
        m.start();
        h.start();

    }
}
