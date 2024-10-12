package Generics;

import java.util.ArrayList;

public class Base {
    public static void main(String[] args) {
        
        // With type defination.
        ArrayList<String> list2 = new ArrayList<>();

      //  list2.add(123); // Not Allowed.
        list2.add("325"); //allowed
    
        System.out.println(list2.get(0));


        // there is no type defination
        // ArrayList list = new ArrayList();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add("Hello World");

        // System.out.println(list.get(3));

    }
}
