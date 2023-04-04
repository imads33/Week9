
/*Write a Java class called Person that has fields for the person's name and age. Write a custom Comparator implementation called AgeComparator that sorts Person objects in ascending order based on their age. Then, modify the Person class to implement the Comparable interface, so that Person objects are sorted first by age (ascending order), and then by name (alphabetical order). Test your implementation by creating a list of Person objects and sorting them using both the AgeComparator and the Comparable implementation.*/
import java.util.*;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int compareTo(Person person) {
        return person.getName().compareTo(person.getName());
    }
}

class AgeComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        if (p1.getAge() > p2.getAge()) {
            return 1;
        } else if (p1.getAge() < p2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<Person>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            person.add(new Person(sc.next(), sc.nextInt()));
        }

        Collections.sort(person, new AgeComparator());
        for (Person p : person) {
            System.out.println(p.getName() + " " + p.getAge());
        }

        Collections.sort(person);
        for (Person p : person) {
            System.out.println(p.getName() + " " + p.getAge());
        }
    }
}