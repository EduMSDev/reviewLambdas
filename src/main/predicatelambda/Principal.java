package main.predicatelambda;

import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Rodrigo", "Collections", 23, 2500),
                new Employee("Pepe", "Telemarketing", 30, 2200),
                new Employee("Pedro", "Sales", 21, 2100),
                new Employee("Juan", "Counter", 32, 2000),
                new Employee("Jose", "Telemarketing", 43, 1900),
                new Employee("Luis", "Counter", 54, 2900),
                new Employee("Alberto", "Sales", 18, 1700),
                new Employee("Aaron", "Collections", 25, 2800));

        Evaluate evaluate = new Evaluate();

        System.out.println("Employees with salaries greater than 2000");
        List<Employee> highestPaid = evaluate.evaluate(employeeList, employee -> employee.getSalary() > 2000);
        highestPaid.forEach(employee -> System.out.println(employee.getName()));

        System.out.println("Young employees");
        List<Employee> youngEmployees = evaluate.evaluate(employeeList, employee -> employee.getAge() < 25);
        youngEmployees.forEach(employee -> System.out.println(employee.getName()));

        Functions functions = new Functions();

        for (Employee youngEmployee : youngEmployees) {
            double newSalary = functions.salaryIncrease(youngEmployee, 10, (salary, increase) -> salary + (salary * increase / 100));
            youngEmployee.setSalary(newSalary);
        }

        System.out.println("New Salaries");
        youngEmployees.forEach(employee -> System.out.println("Name: " + employee.getName() + ", salary: " + employee.getSalary()));
    }
}
