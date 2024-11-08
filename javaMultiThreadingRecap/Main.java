
class World extends Thread {
    @Override
    public void run(){
        for(;;){
         System.out.println("World");
        }
    }
}

// two treads are working together

public class Main {
    public static void main(String[] args) {
        
        World world = new World();
        world.start();

        for(;;){
            System.out.println("Hello");
        }

    }
    
}