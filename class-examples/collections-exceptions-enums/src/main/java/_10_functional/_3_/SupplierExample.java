package _10_functional._3_;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> randomNumber = () -> (int) (Math.random() * 100);

        System.out.println(randomNumber.get()); // 42
        System.out.println(randomNumber.get()); // 75
    }
}
