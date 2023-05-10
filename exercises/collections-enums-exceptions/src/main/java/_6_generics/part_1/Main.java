package _6_generics.part_1;

/*
  Create a Stack class with the following requirements:
  - It should use generics to be able to store any type of objects.
  - It should have a private List field that stores the elements of the stack.
  - It should have a public constructor that initializes the list.
  - It should have the following public methods:
  - push(E element): adds an element to the top of the stack.
  - pop(): removes and returns the top element of the stack. Throws an EmptyStackException if the stack is empty.
  - peek(): returns the top element of the stack without removing it. Throws an EmptyStackException if the stack is empty.
  - isEmpty(): returns true if the stack is empty, false otherwise.

  Create a Car class with the following requirements:
  - It should have a private String field representing the car's brand.
  - It should have a private String for the car's model.
  - It should have a private int field representing the car's year of manufacture.
  - It should have a public constructor that initializes the fields.
  - It should have the following public methods:
  - getModel(): returns the car's model.
  - getBrand(): returns the car's brand.
  - getYear(): returns the car's year of manufacture.
  - toString(): override method in order to be able to print the car objects

 */

public class Main {
  public static void main(String[] args) {
    
    Stack<String> stack = new Stack<>();
    stack.push("Java");
    stack.push("is");
    stack.push("fun");
    System.out.println(stack.pop()); // prints "fun"
    System.out.println(stack.pop()); // prints "is"
    System.out.println(stack.pop()); // prints "Java"
    System.out.println(stack.isEmpty()); // prints "true"


    Stack<Car> carStack = new Stack<>();
    
    Car car1 = new Car("Toyota", "Corolla", 2021);
    Car car2 = new Car("Honda", "Civic", 2020);
    Car car3 = new Car("Ford", "Mustang", 2022);

    carStack.push(car1);
    carStack.push(car2);
    carStack.push(car3);

    System.out.println(carStack.pop());
    System.out.println(carStack.pop());
    System.out.println(carStack.pop()); 
    System.out.println(carStack.isEmpty());
    
    
  }
  
}
