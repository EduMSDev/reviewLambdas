package referencedmethod;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Sandra", 43, "sandra@gmail.com"));
        personList.add(new Person("Alba", 32, "alba@gmail.com"));
        personList.add(new Person("Lucia", 25, "lucia@gmail.com"));
        personList.add(new Person("Carmen", 19, "carmen@gmail.com"));
        personList.add(new Person("Rocio", 53, "rocio@gmail.com"));

        System.out.println("Persons without ordered: ");
        personList.forEach(person -> System.out.println(person));

        /*Without reference method*/
        Collections.sort(personList, (p1, p2) -> Person.compareAge(p1, p2));
        /*With reference method with statics methods*/
        Collections.sort(personList, Person::compareAge);

        System.out.println("Persons ordered");
        personList.forEach(person -> System.out.println(person));

        Comparator comparator = new Comparator();
        /*Without reference method*/
        Collections.sort(personList, (p1, p2) -> comparator.compareName(p1, p2));
        /*With reference method with instance method*/
        Collections.sort(personList, comparator::compareName);
        personList.forEach(System.out::println);


        Collections.sort(personList, (p1, p2) -> p1.compareAge2(p2));
        /*referenced method of an instance of arbitrary type*/
        Collections.sort(personList, Person::compareAge2);
    }
}
