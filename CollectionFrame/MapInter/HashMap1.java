package CollectionFrame.MapInter;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 100);
        fruitPrices.put("Orange", 30);
        fruitPrices.put("Pineapple", 20);
    
        System.out.println("Fruits Prices : " + fruitPrices);
        System.out.println("Orange price : "+fruitPrices.get("Orange"));

        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.print(entry.getKey());
            System.out.print(" " +entry.getValue());
            System.out.println();
        }

    }
}
