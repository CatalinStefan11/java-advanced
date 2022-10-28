package _8_composition;

public class Main {

  public static void main(String args[]) {

    Engine engine = new Engine("Petrol", 300, 6);

    Car car = new Car("Audi", "Silver", engine, "2020");

    System.out.println("Car Object is : " + car);
  }
}