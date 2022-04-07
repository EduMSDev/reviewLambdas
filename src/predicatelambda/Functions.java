package predicatelambda;

import java.util.function.BiFunction;

public class Functions {

    public double salaryIncrease(Employee emp, double increase, BiFunction<Double, Double, Double> bi) {

        return bi.apply(emp.getSalary(), increase);

    }
}
