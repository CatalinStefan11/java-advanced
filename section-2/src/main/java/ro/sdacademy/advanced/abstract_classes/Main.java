package ro.sdacademy.advanced.abstract_classes;

public class Main {


    /*
        Create an interface CanFly that has only one abstract method fly()

        Create an abstract class animal that has one instance variable "name" which is a string
        - the class also has a constructor which initialize name
        - a getter for the name
        - 2 abstract methods - void eat() and void breath();

        Create another abstract class Bird which extends from Animal and implements CanFly
        - the class should implement the abstract methods

        Create a class Dog which extends from animal and implements method eat() and breathe()

        Create a class Parrot which extends from Bird and does NOT override the methods from the parent class.

        TEST CODE:

        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();


     */


    public static void main(String[] args) {
	    Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

    }
}
