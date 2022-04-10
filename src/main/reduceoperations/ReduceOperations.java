package main.reduceoperations;

import java.util.List;
import java.util.stream.IntStream;

public class ReduceOperations {

    public static void main(String[] args) {
        int[] numbers = {4, 6, 8, 10, 12, 78, 61, 72, 12, 64, 39};
        List<Employee> employees = Employee.employees();

        System.out.println("The sum is: " + IntStream.of(numbers).sum());
        System.out.println("The average is: " + IntStream.of(numbers).average().getAsDouble());
        System.out.println("The maximum is: " + IntStream.of(numbers).max().getAsInt());
        System.out.println("The minimum is: " + IntStream.of(numbers).min().getAsInt());
        System.out.println("The elements is: " + IntStream.of(numbers).count());

        System.out.println("\nThe sum of salary is:" + employees.stream().mapToDouble(Employee::getIncome).sum());
        System.out.println("The employee with maximum salary:" + employees.stream().max((emp1, emp2) -> (int) (emp1.getIncome() - emp2.getIncome())));


    }
}
