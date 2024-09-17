package CollectionFrame.Queue.PriorityQueueDS;

import java.util.*;

public class PriorityQueue1 {
    public static void main(String[] args) {

        //this will has priority to minimum number
        // Queue<Integer> pq = new PriorityQueue<>();

        //this will has the priority to maximum number
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(12);
        pq.offer(86);
        pq.offer(11);
        pq.offer(14);

        //to get all element
        System.out.println(pq);

        // to get and remove first element
        pq.poll();
        
        System.out.println(pq);

        // to just see next first element
        System.out.println(pq.peek());

    }
}
