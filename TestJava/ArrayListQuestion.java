package TestJava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListQuestion {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(13);
        list.add(97);
        list.add(98);
        list.add(32);
        list.add(42);

        System.out.println("Before Sorting : " + list);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println("Decending Order : " + list);

    }
}
