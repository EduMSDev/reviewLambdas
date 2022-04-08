package main.creationstreams;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/*Creating streams from arrays*/
public class CreateStreams4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entry = sc.nextLine();

        IntStream streamChar = entry.chars();
        streamChar.forEach(System.out::println);

        streamChar.filter(n -> !Character.isDigit((char) n) && !Character.isWhitespace((char) n))
                .forEach(n -> System.out.println((char) n));

        String str = "HTML, CSS, JAVA";
        Pattern.compile(", ").splitAsStream(str).forEach(System.out::println);
    }
}
