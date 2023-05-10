package _1_functional.part_1;

/*
  Create a functional interface called "MathOperation" with one method that takes two 
  integers as input and returns an integer as output.

  Create a class called "Calculator" that has a method called "performOperation" that takes two 
  integers and a MathOperation object as input, and returns the result of applying the MathOperation to the two integers.

  Create a class called "Addition" that implements the MathOperation interface and defines 
  the method to perform addition of the two integers.

  Create a class called "Subtraction" that implements the MathOperation interface and defines 
  the method to perform subtraction of the two integers.

  Create a main method to test the implementation by performing addition and subtraction 
  operations using the Calculator class and the MathOperation interface.
  
  In main method use lambda expressions to implement "in-line" the interface MathOperation to perform also a multiplication 
  and a division of the numbers.
 */

public class Main {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();

    // Perform addition
    MathOperation addition = new Addition();
    int result = calculator.performOperation(10, 5, addition);
    System.out.println("Result of addition: " + result);

    // Perform subtraction
    MathOperation subtraction = new Subtraction();
    result = calculator.performOperation(10, 5, subtraction);
    System.out.println("Result of subtraction: " + result);


    result = calculator.performOperation(100, 50, (a, b) -> a * b);
    System.out.println("Result of multiplication: " + result);
  }
}
