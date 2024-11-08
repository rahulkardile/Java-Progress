
class World extends Thread {
    @Override
    public void run(){
        for(;;){
         System.out.println(Thread.currentThread().getName());
        }
    }
}

// two treads are working together

public class Main {
    public static void main(String[] args) {
        
        World world = new World();        
        world.start();


        //to create new thread with runnable
        NewWorld newWorld = new NewWorld();
        Thread t1 = new Thread(newWorld);
        t1.start();

        for(;;){
            System.out.println(Thread.currentThread().getName());
        }



    }
    
}