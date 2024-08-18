package arrays;

public class Basic2 {
    public static void main(String[] args) {
        int arr[] = { 20, 12, 31, 32, 33, 34, 35 };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("For Each");

        for (int num : arr) {
            System.out.println(num);
        }

        // sum
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}
