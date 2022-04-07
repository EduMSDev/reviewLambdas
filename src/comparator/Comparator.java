package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparator {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Pedro", "Jose", "Edu");

        System.out.println("Before ordering: " + names);
        Collections.sort(names);
        System.out.println("After ordering: " + names);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Sandra"));
        personList.add(new Person(2, "Alba"));
        personList.add(new Person(3, "Silvia"));
        personList.add(new Person(4, "Juana"));
        personList.add(new Person(5, "Rocio"));

        System.out.println("Before ordering: " + personList);
        Collections.sort(personList);
        System.out.println("After ordering: " + personList);

        /*Collections.sort(personList, new SortPeopleById());*/

        Collections.sort(personList, java.util.Comparator.comparingInt(Person::getId));


        System.out.println("Person sorted By Id: " + personList);

    }
}
