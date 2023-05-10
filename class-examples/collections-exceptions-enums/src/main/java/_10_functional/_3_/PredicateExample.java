package _10_functional._3_;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> startsWithA = str -> str.startsWith("A");

        System.out.println(startsWithA.test("Apple")); // true
        System.out.println(startsWithA.test("Banana")); // false
    }
}
