package main.introstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTests {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> numStream = numbers.stream();

        int sum = numStream.filter(n -> n % 2 == 1)
                .map(mapper -> mapper * mapper).reduce(0, Integer::sum);

        System.out.println("The sum of the even numbers is: " + sum);
    }
}
