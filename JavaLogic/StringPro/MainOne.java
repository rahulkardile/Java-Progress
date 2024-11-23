package StringPro;

public class MainOne {
    public static void main(String[] args) {

        // 1. Reverse the String
        String name = "Rahul Kardile";
        String result = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            result += name.charAt(i);
        }

        // System.out.println(result);

        // 2. extract Repeated Values
        String pairs = "abcckkdcc";
        for (int i = 0; i < pairs.length() - 1; i++) {
            if (pairs.charAt(i) == pairs.charAt(i + 1)) {
                // System.out.println((pairs.charAt(i)) + "" + pairs.charAt(i + 1));
            }
        }

        // 3. find highest element in an array!
        int elements[] = { 12, 23, 979, 767, 658, 32, 97, 898, 878 };
        int FirstHighest = Integer.MIN_VALUE;

        for (int i = 0; i < elements.length; i++) {
            if (FirstHighest < elements[i]) {
                FirstHighest = elements[i];
            }
        }
        System.out.println("First Highest Element : " + FirstHighest);

        // 4. second Highest Element in an array!
        int secondHighst = Integer.MIN_VALUE;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > secondHighst && elements[i] < FirstHighest) {
                secondHighst = elements[i];
            }
        }
        System.out.println("Second Highest Element : " + secondHighst);

        // 5. Sort an array
        // bubble sort [Time complexity = O(n^2)]
        
        // for (int i = 0; i < elements.length - 1; i++) { 
        //     for (int j = 0; j < elements.length - i - 1; j++) {
        //         if (elements[j] > elements[j + 1]) {

        //             int temp = elements[j];
        //             elements[j] = elements[j + 1];
        //             elements[j + 1] = temp;

        //         }
        //     }
        // }

        // Selection sort
        

        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }

    }
}
