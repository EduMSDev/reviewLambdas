package main.mapoperations;

import java.util.List;

public class MapOperations {
    public static void main(String[] args) {
        /*IntStream.rangeClosed(1, 5).map(map -> map * map).forEach(System.out::println);

        IntStream.rangeClosed(1, 10).map(map -> map * 2).forEach(System.out::println);*/

        List<Employee> employees = Employee.employees();

        System.out.println("Average female income over 25 years:");
        double sum = employees.stream().filter(Employee::isWomen).filter(employee -> employee.getAge() > 25).
                mapToDouble(Employee::getIncome).sum();
        double average = sum / employees.stream().filter(Employee::isWomen).filter(employee -> employee.getAge() > 25).count();

        System.out.println("The average is: " + average);


    }
}
