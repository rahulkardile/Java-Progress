package CollectionFrame.Set.LinkedHashSet;

import java.util.*;;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        
        // it will does not contain duplicate value
        // it will also be in a sorted maner
         
        Set<Integer> set = new LinkedHashSet<>();
        
        set.add(32);
        set.add(8);
        set.add(43);
        set.add(65);
        set.add(43);

        System.out.println(set);

        set.remove(8);
        System.out.println(set);

        // to check is an element is present or not
        System.out.println(set.contains(43));

        // to check set is empty or not
        System.out.println(set.isEmpty());
 
        //to checkk the size of set
        System.out.println(set.size());

        // to remove all element from the set
        set.clear();

        System.out.println(set);

    }
}
