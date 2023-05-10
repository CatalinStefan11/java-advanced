package _1_functional.part_1;

public class Calculator {
    public int performOperation(int a, int b, MathOperation mathOperation) {
        return mathOperation.operate(a, b);
    }
}
