package functionlambda;

import java.util.function.Function;

public class TestFunction {

    public static void main(String[] args) {
        Function<Integer, String> conversor = x -> Integer.toString(x);

        System.out.println(conversor.apply(2).length());
        System.out.println(conversor.apply(20).length());
    }
}
