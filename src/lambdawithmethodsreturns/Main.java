package lambdawithmethodsreturns;

public class Main {
    public static void main(String[] args) {
        System.out.println(create().calculate(2, 0));
    }

    private static CalculatorLong create() {
        long var = 201;
        return ((x, y) -> x / y + var);
    }

}
