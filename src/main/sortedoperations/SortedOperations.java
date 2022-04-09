package main.sortedoperations;

import main.mapoperations.Employee;

import java.util.List;

public class SortedOperations {

    public static void main(String[] args) {
        /*System.out.println("Sorted names:");
        Arrays.asList("Alfredos", "Maria", "Daniel", "Brenda").stream().sorted().forEach(System.out::println);

        System.out.println("Sorted numbers:");
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().sorted().forEach(System.out::println);*/

        System.out.println("Employees in alphabetical order");
        List<Employee> employeeList = Employee.employees();
        employeeList.stream().sorted().forEach(employee -> System.out.println(employee.getName()));

        System.out.println("Employees sorted by age");
        employeeList.stream().sorted((employee1, employee2) -> employee1.getAge() - employee2.getAge()).
                forEach(employee -> System.out.println(employee.getName() + " " + employee.getAge()));


    }
}
