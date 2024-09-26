package CollectionFrame.Other;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClass1 {
    public static void main(String[] args) {
     
        List<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(31);
        list.add(72);
        list.add(92);
        list.add(72);

        System.out.println("Min element : " + Collections.min(list));
        System.out.println("Max element : " + Collections.max(list));

        // how many time a value is repeated
        System.out.println(Collections.frequency(list, 72));

        // To Sort
        // Collections.sort(list);
        Collections.sort(list, Comparator.reverseOrder());

        System.out.println(list);

        
    }
}
