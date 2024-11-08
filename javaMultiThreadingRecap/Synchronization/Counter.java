package Synchronization;

public class Counter {
    
    private int count = 0;

    // public synchronized void increament(){
    //     count++;
    // }

    public void increament(){
        synchronized(this){
            count++;
        }
    }

    public int getCount(){
        return count;
    }

}
