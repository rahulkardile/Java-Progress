package JavaLogic.Basics;

import java.util.stream.Stream;

class InnerMapFilterReduce {
    public static void main(String[] args) {
    
        Stream<Integer> numArr = Stream.iterate(1, x -> x + 1).limit(200);

        numArr.forEach(System.out::println);
        
        
    }
}
