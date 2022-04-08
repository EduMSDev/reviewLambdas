package main.creationstreams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/*Creating streams using the Stream object builder*/
public class CreateStreams {

    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("Programming course");
        stream1.forEach(System.out::println);

        Stream<String> stream2 = Stream.of("curso1", "curso2", "curso3", "curso4");
        stream2.forEach(System.out::println);

        Stream<Student> studentStream = Stream.<Student>builder().
                add(new Student("n01", 15, 1.70, 9.5)).
                add(new Student("n02", 21, 1.70, 9.5)).build();

        studentStream.forEach(student -> System.out.println(student.getIdentification()));

        IntStream oneToTwenty = IntStream.rangeClosed(1, 20);
        oneToTwenty.forEach(System.out::println);
    }
}
