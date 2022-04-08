package main.consumerlambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Principal {

    public static void main(String[] args) {
        List<Student> studentsList = Arrays.asList(
                new Student("Sandra", 10), new Student("Rocio", 9),
                new Student("Sara", 4), new Student("Olivia", 7),
                new Student("Inma", 6), new Student("Amanda", 3),
                new Student("Miriam", 8), new Student("Cinthia", 4));

        Operations operations = new Operations();
        System.out.println("Students without updated qualification");
        Consumer<Student> cons = e -> System.out.println("Name: " + e.getName() + "Qualification: " + e.getQualification());
        operations.acceptStudents(studentsList, cons);

        System.out.println("Students with updated qualification");
        Consumer<Student> cons2 = e -> e.setQualification(e.getQualification() * 1.15);
        operations.acceptStudents(studentsList, cons2);
    }
}
