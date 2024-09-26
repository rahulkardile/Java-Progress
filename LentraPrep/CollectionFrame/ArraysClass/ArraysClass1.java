package CollectionFrame.ArraysClass;

import java.util.*;;

public class ArraysClass1 {
    public static void main(String[] args) {
        // int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int index = Arrays.binarySearch(a, 9);

        // System.out.println("Index of element 9 is : " + index);

        Integer[] numbers = { 2, 23, 12, 98, 76, 54, 9, 98, 76, 65, 32, 211 };
        Arrays.sort(numbers);
        int findIndex = Arrays.binarySearch(numbers, 98);
        System.out.println(findIndex);

        // Arrays.fill(numbers, 12);

        for (int i : numbers) {
        System.out.print(i + ", ");
        }
        
    }
}
