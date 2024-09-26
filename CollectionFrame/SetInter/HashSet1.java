package CollectionFrame.SetInter;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
    public static void main(String[] args) {
        
        Set<String> fruits = new HashSet<String>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Orange"); //duplicate element

        System.out.println(fruits);

         // Iterating using for-each loop
         for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
