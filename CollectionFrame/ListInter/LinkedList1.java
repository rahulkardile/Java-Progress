package CollectionFrame.ListInter;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<String>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Orange");

        // you can add at the first
        fruits.addFirst("Pineapple");

        // you can also add from last
        fruits.addLast("DragonFruit");

        System.out.println("Inicial list without sort : " + fruits);

        // sorting in alphabetical order
        Collections.sort(fruits);

        // after sorting
        System.out.println("After sorting : " + fruits);

        System.out.println("First List Element : " + fruits.getFirst());
        System.out.println("Last List Element : " + fruits.getLast());

        // remove first and last element.
        fruits.removeFirst();
        fruits.removeLast();

        // update list
        System.out.println("Updated list : " + fruits);

        System.out.println("Intration over list : ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
