import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class PrepOfList {

    public static <T> ArrayList<T> removeDuplicateElement(ArrayList<T> list) {

        ArrayList<T> newArrayList = new ArrayList<>();

        for (T element : list) {
            if (!newArrayList.contains(element)) {
                newArrayList.add(element);
            }
        }

        return newArrayList;

    }

    public static void main(String[] args) {

        // Learn Array List
        ArrayList<String> arrList = new ArrayList<>();

        arrList.add("Apple");
        arrList.add("domato");
        arrList.add("Kivi");
        arrList.add("Banana");
        arrList.add("Apple");

        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }

        System.out.println(removeDuplicateElement(arrList));

        // Set is an interface which store only unique data it does not allow any duplicate element.
        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("domato");
        fruits.add("Kivi");
        fruits.add("Banana");
        fruits.add("Apple"); // ignores the element!

        System.out.println("");
        System.out.println("set will ignore duplicate");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // map is an interface which store data in a key value pair.
        HashMap<Integer, String> fruitsHash = new HashMap<>(); 
        fruitsHash.put(1,"Apple");
        fruitsHash.put(2,"domato");
        fruitsHash.put(3,"Kivi");
        fruitsHash.put(4,"Banana");
        fruitsHash.put(4,"Apple");

        System.out.println("");
        System.out.println("Hashset started");
        for(Integer key : fruitsHash.keySet()){
            System.out.println("Key : " + key + "\t" + "value : " + fruitsHash.get(key));
        }


    }
}