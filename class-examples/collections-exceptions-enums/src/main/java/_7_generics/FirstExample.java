package _7_generics;

public class FirstExample {
  public static void main(String[] args) {

    Box<Gift> giftBox = new Box<>();

    // gift was packed for delivery
    giftBox.putInside(new Gift("Kylie Jenner makeup", 100));
    
    // gift was unpacked by the receiver
    System.out.println(giftBox.getOut());
    
    
    Box<Furniture> furnitureBox = new Box<>();
    
    // furniture was packed by the company in order to deliver it
    furnitureBox.putInside(new Furniture("Ikea", 2000, "wardrobe"));

    System.out.println(furnitureBox.getOut());
  }
  
}

class Box<T> {
  private T objectInside;

  public void putInside(T objectInside) {
    this.objectInside = objectInside;
  }

  public T getOut() {
    return objectInside;
  }
}

class Gift {
  String name;
  double price;

  public Gift(String name, double price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Gift{" +
        "name='" + name + '\'' +
        ", price=" + price +
        '}';
  }
}

class Furniture {
  String brand;
  double price;
  String name;

  public Furniture(String brand, double price, String name) {
    this.brand = brand;
    this.price = price;
    this.name = name;
  }

  public String getBrand() {
    return brand;
  }

  public double getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Furniture{" +
        "brand='" + brand + '\'' +
        ", price=" + price +
        ", name='" + name + '\'' +
        '}';
  }
}

