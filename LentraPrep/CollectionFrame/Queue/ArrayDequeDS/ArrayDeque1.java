package CollectionFrame.Queue.ArrayDequeDS;

import java.util.*;;

public class ArrayDeque1 {
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        // to add element it also add element at the last
        adq.offer(32);

        // to add element at the first
        adq.offerFirst(99);

        // to add element at the last
        adq.offerLast(66);
        adq.offer(67); 

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("After Poll : " + adq.poll());

        System.out.println(adq.pollFirst());
        System.out.println("After poll first : " + adq);

        System.out.println(adq.pollLast());
        System.out.println("After poll last : " + adq);
    }
}
