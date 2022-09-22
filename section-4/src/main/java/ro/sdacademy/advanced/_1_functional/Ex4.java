package ro.sdacademy.advanced._1_functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex4 {

    public static void main(String[] args) {
        /*
        Write code to print the items in the list in sorted order,
        and with the first letter in each name upper-cased.
        The name "harry" should be printed as "Harry" and should be printed
        after "Emily" and before "Isla". Use lambda expressions wherever possible.
        */
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "olivia",
                "emily",
                "isla",
                "ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        List<String> firstNameUpperCase = new ArrayList<>();
        
        topNames2015.forEach(s -> firstNameUpperCase.add(s.substring(0, 1).toUpperCase() + s.substring(1)));
        
        firstNameUpperCase.sort((x, y) -> x.compareTo(y));
        firstNameUpperCase.forEach(s -> System.out.println(s));

        System.out.println("---------------------------------------------");
        
        firstNameUpperCase.stream()
            .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
            .sorted()
            .forEach(System.out::println);
        
        
    }
}
