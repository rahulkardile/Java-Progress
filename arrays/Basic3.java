package arrays;

public class Basic3 {
    public static void main(String[] args) {
        int arr[] = { 232, 434, 432, 21, 55, 2, 653, 13, 2 };

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }
        System.out.println("min is : " + min);
        System.out.println("max is : " + max);
    }
}
