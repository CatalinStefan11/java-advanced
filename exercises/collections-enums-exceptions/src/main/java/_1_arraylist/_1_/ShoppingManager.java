package _1_arraylist._1_;

import java.util.ArrayList;


public class ShoppingManager {

  private ArrayList<Item> storeStock;
  private ArrayList<Item> shoppingBasket;

  public ShoppingManager() {
    this.storeStock = new ArrayList<>();
    this.shoppingBasket = new ArrayList<>();
  }

  public double buyItemsFromBasket() {

    double totalPrice = 0;

    for (Item item : shoppingBasket) {
      totalPrice += sellItemFromStock(item.getName(), item.getQuantity());
    }
    shoppingBasket.clear();
    return totalPrice;
  }

  public void addItemToBasket(String name, int quantity) {

    for (Item item : storeStock) {
      if (name.equals(item.getName())) {
        if (item.getQuantity() >= quantity) {
          shoppingBasket.add(new Item(item.getName(), quantity, item.getPrice()));
          break;
        } else {
          System.out.println("The quantity that you want to buy is unavailable!");
        }
      }
    }
  }

  public double sellItemFromStock(String name, int quantity) {

    for (Item item : storeStock) {
      if (name.equals(item.getName())) {

        if (item.getQuantity() >= quantity) {
          item.decrementQuantity(quantity);
          return item.getPrice() * quantity;
        } else {
          System.out.println("Quantity unavailable!");
        }
      }
    }
    return 0;
  }

  public void addItemInStock(String name, int quantity, double price) {

    for (Item item : storeStock) {
      if (name.equals(item.getName())) {
        item.incrementQuantity(quantity);
        // price is updated
        item.setPrice(price);
        return;
      }
    }
    storeStock.add(new Item(name, quantity, price));
  }
  
}
