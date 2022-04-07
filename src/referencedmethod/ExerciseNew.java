package referencedmethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ExerciseNew {

    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("10", "65", "8", "97", "46", "32", "0");
        /*Constructor method reference*/
        getResults(numbers, Integer::new).forEach(System.out::println);
    }

    public static List<Integer> getResults(List<String> data, Function<String, Integer> function) {
        List<Integer> results = new ArrayList<>();
        data.forEach(stringNumber -> results.add(function.apply(stringNumber)));
        return results;

    }
}
