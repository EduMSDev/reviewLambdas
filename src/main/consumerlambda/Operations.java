package main.consumerlambda;

import java.util.List;
import java.util.function.Consumer;

public class Operations {

    public void acceptStudents(List<Student> students, Consumer<Student> consumer) {
        for (Student student : students) {
            consumer.accept(student);
        }
    }
}
