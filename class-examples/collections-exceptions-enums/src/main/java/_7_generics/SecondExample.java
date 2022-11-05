package _7_generics;

public class SecondExample {
  public static void main(String[] args) {
    
    // Garage<String> garage = new Garage<String>(); // it doesn't compile

    Garage<Audi> garage = new Garage<>();
    garage.putInside(new Audi());

    Garage<Car> garage1 = new Garage<>();
    garage1.putInside(new Car("suzuki", 20000, "red"));

    Garage<BMW> garage2 = new Garage<>();
    garage2.putInside(new BMW());
  }
}

// wild cards
class Garage<T extends Car> {
  private T car;

  public void putInside(T car) {
    this.car = car;
  }

  public T getOut() {
    return car;
  }
}

class Car {
  public String model;
  public double price;
  public String color;

  public Car(String model, double price, String color) {
    this.model = model;
    this.price = price;
    this.color = color;
  }
}

class Audi extends Car {
  public Audi() {
    super("Audi", 50000, "silver");
  }
}

class BMW extends Car {
  public BMW() {
    super("BMW", 40000, "blue");
  }
}
