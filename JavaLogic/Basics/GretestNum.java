package JavaLogic.Basics;

import java.util.Arrays;
import java.util.stream.IntStream;

public class GretestNum {
    public static void main(String[] args) {
        int[] numArr = {32, 53, 21};

        IntStream nums = Arrays.stream(numArr);
        // int[] num = {0};

        // nums.forEach(a -> {
        //     if (a > num[0]) num[0] = a;
        // });

        // System.out.println("Gretest num is : " + num[0]);
    
        int GretestNum = Arrays.stream(numArr).reduce(Integer.MIN_VALUE, (a, b)-> a > b ? a : b);

        System.out.println(GretestNum);

    }
}
