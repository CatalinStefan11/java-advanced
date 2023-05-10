package _10_functional._3_;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, String> numberToText = num -> {
            switch (num) {
                case 1:
                    return "one";
                case 2:
                    return "two";
                case 3:
                    return "three";
                default:
                    return "unknown";
            }
        };

        System.out.println(numberToText.apply(1)); // one
        System.out.println(numberToText.apply(4)); // unknown
    }
}
