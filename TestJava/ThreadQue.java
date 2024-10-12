package TestJava;

class PlayGame extends Thread  {

    @Override
    public void run(){
        for(; ;){
            System.out.println("Playing . . . ");
        }
    }
}

public class ThreadQue {

    public static void main(String[] args) {
        
        PlayGame playGame = new PlayGame();
        playGame.start();
       
        for(; ;){
            System.out.println("Studing . . .");
        }

    }
}
