package main.creationstreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
/* Creating streams from arrays */
public class CreateStream5 {

    public static void main(String[] args) {
        Path path = Paths.get("src/resources/file.txt");

        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(line -> {
                System.out.println("Linea...");
                System.out.println(line);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
