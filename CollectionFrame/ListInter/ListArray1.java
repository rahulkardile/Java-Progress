package CollectionFrame.ListInter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListArray1 {
    public static void main(String[] args) {
        
        List<Integer> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Orange"); // Duplicate Elements.

        // List<String> fruits2 = new ArrayList<String>();
        // fruits2.add("PineApple");
        // fruits2.add("Lemon");
        // fruits2.add("DragonFruit");

        // for sorting.
        Collections.sort(fruits);

        System.out.println(fruits);
        System.out.println(fruits.get(2));

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }

}