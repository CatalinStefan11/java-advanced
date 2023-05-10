package _5_exceptions._2_;

public enum Toppings {
  CHEESE(3),
  HAM(4),
  MUSHROOMS(2),
  CHICKEN(5),
  OLIVES(1);

  private int price;

  Toppings(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }
}
