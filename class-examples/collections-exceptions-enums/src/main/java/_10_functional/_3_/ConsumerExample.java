package _10_functional._3_;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());

        printUpperCase.accept("hello"); // HELLO
        printUpperCase.accept("world"); // WORLD
    }
}
