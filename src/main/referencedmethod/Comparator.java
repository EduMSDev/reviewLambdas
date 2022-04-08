package main.referencedmethod;

public class Comparator {
    public int compareName(Person pers1, Person pers2) {
        return pers1.getName().compareTo(pers2.getName());
    }

    public int compareAge(Person a, Person b) {
        return a.getAge().compareTo(b.getAge());
    }

}
