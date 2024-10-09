
public class Main extends Thread {

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(i);
            try{
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {

        Main t1 = new Main();
        t1.start();
        t1.join(); // it will wait for t1 to finish.
        System.out.println("Main find that t1 is finished");
    }
}