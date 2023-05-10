package _0_inheritance._1_part;

public class Main {


  // Create an Animal class that has a name which is a String, size which is an int, and weight which is an int also
  // Write setters and getters for each instance variable and the constructor
  // Animal also contains a method eat() which just prints "Animal.eat() called"
  // 
  // Crete Dog class which extends from Animal
  // Dog has also eyes which is an int, legs which is an int, teeth which is an int and coat which is a String
  // Dog overrides the method eat
  // Dog also has another method called chew() which just print "Dog.chew() called"

  
  public static void main(String[] args) {
    Animal animal = new Animal("Animal", 5, 5);

    Dog dog = new Dog("Yorkie", 8, 20, 2, 1, 20, "long silky");
    dog.eat();

  }
}
