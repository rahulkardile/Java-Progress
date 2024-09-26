package Java8Fetures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 32, 2, 42, 52, 323, 43, 223, 33, 22, 312454, 6, 546, 47, 67, 6, 7657);

        List<Integer> evenList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);

        

    }
}
