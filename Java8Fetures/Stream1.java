package Java8Fetures;

import java.util.Arrays;

public class Stream1 {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 6, 3, 9, 21 };
        int sum = 0;

        for(int num : arr){
            if(num % 2 == 0){
                sum += num;
            }
        }

        System.out.println(sum);

        int sum2 = Arrays.stream(arr).filter(n -> n % 2 == 0).sum();
        System.out.println(sum2);
    }
}
