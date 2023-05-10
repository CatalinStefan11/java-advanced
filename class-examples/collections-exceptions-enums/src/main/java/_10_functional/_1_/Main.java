package _10_functional._1_;

public class Main {
    public static void main(String[] args) {
        // Using functional interface with class implementation
        MyFunction myFunction = new MyFunctionImpl();
        int result1 = myFunction.apply(5);
        System.out.println("Result using class implementation: " + result1);

        // Using functional interface with lambda expression
        MyFunction myFunction2 = x -> x * 2; // lambda expression
        int result2 = myFunction2.apply(5);
        System.out.println("Result using lambda expression: " + result2);
    }
}