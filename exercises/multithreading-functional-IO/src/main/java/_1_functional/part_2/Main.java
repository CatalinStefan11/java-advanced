package _1_functional.part_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
    Create a class called Person with the following attributes:
    - name (String)
    - age (int)
    - gender (String)
    The class should have a constructor that takes in these attributes as arguments and getters for each attribute.
    The class should also have overridden the toString() method

    Create a class called PeopleFilter that has a static method called filterPeople that takes in two arguments: 
    - a list of Person objects and a Predicate<Person> object. 
    The method should return a list of Person objects that meet the criteria specified by the Predicate.

    In the Main class, create a list of Person objects and add at least 5-6 Person objects to the list.

    Create 3 different Predicate<Person> objects that filter the list of Person objects based on the following criteria:
    - Male people
    - People over 30
    - People with names starting with "M"

    Use the filterPeople method from the PeopleFilter class to filter the list of Person objects using 
    each of the Predicate<Person> objects previously created.

 */

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 25, "Male"));
        people.add(new Person("Mary", 30, "Female"));
        people.add(new Person("Mike", 35, "Male"));
        people.add(new Person("Lisa", 40, "Female"));

        Predicate<Person> malePredicate = person -> person.getGender().equals("Male");
        List<Person> malePeople = PeopleFilter.filterPeople(people, malePredicate);
        System.out.println("Male people: " + malePeople);

        Predicate<Person> agePredicate = person -> person.getAge() > 30;
        List<Person> peopleOver30 = PeopleFilter.filterPeople(people, agePredicate);
        System.out.println("People over 30: " + peopleOver30);

        Predicate<Person> namePredicate = person -> person.getName().startsWith("M");
        List<Person> peopleWithMName = PeopleFilter.filterPeople(people, namePredicate);
        System.out.println("People with names starting with M: " + peopleWithMName);
    }
}