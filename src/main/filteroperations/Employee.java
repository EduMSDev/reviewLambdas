package main.filteroperations;

import java.util.Arrays;
import java.util.List;

public class Employee {

    private long id;
    private String name;
    private double income;
    private Gender gender;
    private int age;

    public static enum Gender {
        MEN, WOMEN
    }

    public Employee(long id, String name, double income, Gender gender, int age) {
        this.id = id;
        this.name = name;
        this.income = income;
        this.gender = gender;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMen() {
        return this.gender == Gender.MEN;
    }

    public boolean isWomen() {
        return this.gender == Gender.WOMEN;
    }

    public static List<Employee> employees() {
        Employee employee1 = new Employee(1, "Juan", 538.00, Gender.MEN, 26);
        Employee employee2 = new Employee(2, "Alicia", 600.00, Gender.WOMEN, 28);
        Employee employee3 = new Employee(3, "Pedro", 800.00, Gender.MEN, 22);
        Employee employee4 = new Employee(4, "Jessica", 700.00, Gender.WOMEN, 24);
        Employee employee5 = new Employee(5, "Alberto", 400.00, Gender.MEN, 27);
        return Arrays.asList(employee1, employee2, employee3, employee4, employee5);
    }
}
