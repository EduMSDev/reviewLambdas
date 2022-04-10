package main.reduceoperations;

import java.util.stream.IntStream;

public class ReduceOperations2 {
    public static void main(String[] args) {
        int[] numbers = {4, 6, 8, 10, 12, 78, 61, 72, 12, 64, 39};

        int sum = IntStream.of(numbers).reduce(Integer::sum).getAsInt();
        System.out.println("The sum is: " + sum);

        System.out.println(IntStream.rangeClosed(1, 20).summaryStatistics());
        System.out.println("The sum with one function: " + IntStream.rangeClosed(1, 20).summaryStatistics().getSum());
        System.out.println("The average with one function: " + IntStream.rangeClosed(1, 20).summaryStatistics().getAverage());
    }
}
