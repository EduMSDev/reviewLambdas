package main.bifunctionlambda;

import java.util.function.BiFunction;

public class BiFunctionExercises {
    /*The function interface uses the first two generics to specify the type of the input object
    and the second is the type of the output object. */
    public static void main(String[] args) {
        BiFunction<String, String, String> bi = (x, y) -> x = y;
        System.out.println(bi.apply("Hello", "World"));
    }
}
