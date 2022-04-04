package lambdawithmethodsreturns;

public class Principal {

    /*When the ambiguity of the data is given, it is necessary to specify it in the lambda*/
    public static void main(String[] args) {
        engine((CalculatorInt) (x, y) -> x + y);
    }

    public static void engine(CalculatorInt calculatorInt) {

    }

    public static void engine(CalculatorLong calculatorLong) {

    }
}
