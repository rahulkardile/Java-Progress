package Java8Fetures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 32, 2, 42, 52, 323, 43, 223, 33, 22, 312454, 6, 546, 47, 67, 6, 7657);

        // filter
        List<Integer> evenList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);

        // map
        List<Integer> mapList = evenList.stream().map(x -> x / 2).collect(Collectors.toList());
        System.out.println(mapList);

        // map, filter, distinct (removes all duplicate elements), sorted (sort all the
        // numbers);
        List<Integer> advanceList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct()
                // .sorted((a, b) -> (b - a)) // sort's in desending order
                .sorted() // sorts in asending order
                .limit(3) // it limit elements
                .skip(2) // skips element 
                .collect(Collectors.toList());

        System.out.println(advanceList);

    }
}
