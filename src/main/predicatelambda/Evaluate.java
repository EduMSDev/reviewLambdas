package main.predicatelambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Evaluate {

    public List<Employee> evaluate(List<Employee> employeeList, Predicate<Employee> eval) {
        List<Employee> employeesFiltered = new ArrayList<>();

        for (Employee employee : employeeList) {
            if (eval.test(employee)) {
                employeesFiltered.add(employee);
            }
        }
        return employeesFiltered;
    }
}
