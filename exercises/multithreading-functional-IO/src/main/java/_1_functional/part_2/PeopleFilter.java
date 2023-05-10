package _1_functional.part_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PeopleFilter {
    public static List<Person> filterPeople(List<Person> people, Predicate<Person> predicate) {
        List<Person> filteredPeople = new ArrayList<>();
        for (Person person : people) {
            if (predicate.test(person)) {
                filteredPeople.add(person);
            }
        }
        return filteredPeople;
    }
}