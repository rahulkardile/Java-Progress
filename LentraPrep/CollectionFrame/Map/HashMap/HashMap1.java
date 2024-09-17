package CollectionFrame.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("one", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);

        // if (!numbers.containsKey("Two")) {
        // numbers.put("Two", 22);
        // }

        numbers.putIfAbsent("Two", 23);

        System.out.println(numbers);

        // it will return key and value
        // for (Map.Entry<String, Integer> e : numbers.entrySet()) {
        // System.out.println(e);
        // }

        // it will return only keys
        // for (String key : numbers.keySet()) {
        // System.out.println(key);
        // }

        // it will return only values
        // for (Integer value : numbers.values()) {
        // System.out.println(value);
        // }

        System.out.println(" check key : " + numbers.containsKey("Two"));
        System.out.println(" check value : " + numbers.containsValue(2));

        System.out.println("check is empty or not : " + numbers.isEmpty());

    }
}
