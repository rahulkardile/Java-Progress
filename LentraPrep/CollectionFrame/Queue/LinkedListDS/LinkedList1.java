package CollectionFrame.Queue.LinkedListDS;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList1 {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(21);
        queue.offer(24);
        queue.offer(23);
        queue.offer(54);

        // To See alll the element present in Queue
        System.out.println(queue);

        // To get and remove the top element
        System.out.println(queue.poll());

        //to see top element
        System.out.println(queue.peek());
        
    }
}
