package ro.sdacademy.advanced.inheritance_part_1;


public class Animal {

  private String name;

  private int size;
  private int weight;

  public Animal(String name, int size, int weight) {
    this.name = name;
    this.size = size;
    this.weight = weight;
  }

  public void eat() {
    System.out.println("Animal.eat() called");
  }

  public String getName() {
    return name;
  }

  public int getSize() {
    return size;
  }

  public int getWeight() {
    return weight;
  }
}
