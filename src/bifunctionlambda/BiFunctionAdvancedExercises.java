package bifunctionlambda;

public class BiFunctionAdvancedExercises {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        String result = calculator.calculator((x, y) -> ":" + (x * y), 60, 10);

        System.out.println("result: " + result);
    }
}
