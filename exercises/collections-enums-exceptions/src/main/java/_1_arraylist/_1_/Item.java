package _1_arraylist._1_;


public class Item {
  private String name;
  private int quantity;
  private double price;

  public Item(String name, int quantity, double price) {
    this.name = name;
    this.quantity = quantity;
    if(price > 0){
      this.price = price;
    }
  }

  public String getName() {
    return name;
  }

  public int getQuantity() {
    return quantity;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    if(price > 0){
      this.price = price;
    }
  }
  
  public void incrementQuantity(int quantToAdd){
    this.quantity += quantToAdd;
  }

  public void decrementQuantity(int quantToSubtract){
    this.quantity -= quantToSubtract;
  }
}
