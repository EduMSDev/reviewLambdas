package main.creationstreams;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*Creating streams from arrays*/
public class CreateStream3 {
    public static void main(String[] args) {
        IntStream numStream = Arrays.stream(new int[]{1, 2, 3, 4});
        numStream.forEach(System.out::println);

        Stream<String> names = Arrays.stream(new String[]{"Juan", "Pedro", "Carlos"});
        names.forEach(System.out::println);

        Set<String> languages = new HashSet<>();
        languages.add("Java");
        languages.add("C++");
        languages.add("C#");

         languages.stream().forEach(System.out::println);

        List<Student> students = new ArrayList<>();
        students.add(new Student("n01", 15, 1.43, 9.3));
        students.add(new Student("n02", 14, 1.56, 9.5));
        students.add(new Student("n04", 18, 1.65, 8.2));
        students.add(new Student("n05", 19, 1.75, 9));
        students.add(new Student("n06", 17, 1.85, 7.2));
        students.add(new Student("n07", 13, 1.54, 5.2));
        students.add(new Student("n08", 17, 1.65, 1.2));

        Stream<Student> studentStream = students.parallelStream();
        studentStream.forEach(student -> System.out.println(student.getIdentification()));


    }
}
