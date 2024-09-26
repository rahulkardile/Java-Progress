package Java8Fetures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ToStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> stream = list.stream();

        String[] array = {"apple", "banana", "cherry"};
        Stream myStream = Arrays.stream(array);

        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(100);

        Stream<Integer> limit1 = Stream.generate(()-> (int) Math.random() * 100).limit(5);

        
        
    }
}
