package main.filteroperations;

import java.util.List;

public class FilterOperations {

    public static void main(String[] args) {
        List<Employee> employees = Employee.employees();

        System.out.println("Men Employees:");
        employees.stream().filter(Employee::isMen).forEach(employee -> System.out.println(employee.getName()));

        System.out.println("\nWomen Employees:");
        employees.stream().filter(Employee::isWomen).forEach(employee -> System.out.println(employee.getName()));

        System.out.println("\nEmployees over 25 years:");
        employees.stream().filter(employee -> employee.getAge() > 25).forEach(employee -> System.out.println(employee.getName()));

        System.out.println("\nMen employees and his name starts with A:");
        employees.stream().filter(Employee::isMen).filter(employee -> employee.getName().startsWith("A")).
                forEach(employee -> System.out.println(employee.getName()));


    }
}
