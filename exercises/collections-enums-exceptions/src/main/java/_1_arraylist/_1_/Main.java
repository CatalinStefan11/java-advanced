package _1_arraylist._1_;

public class Main {

  /**
   * Create a class Item with the following instance variables: name - String, quantity - int, price - double
   *
   * Create the following methods:
   * - constructor (check if the price is greater than 0)
   * - getters for all the fields
   * - setter for price - (check if the price is greater than 0)
   * - incrementQuantity(int quant) - method that adds the parameter "quant" to the field quantity 
   * - decrementQuantity(int quant) - method that subtracts the parameter "quant" from the field quantity 
   *
   * Create a class ShoppingManager. The class should have 2 lists as instance variables. 
   * Both fields are lists of Item. One of them represents store's stock and 
   * the other one is the shopping basket of the client.
   *
   * Create the following methods: 
   * - constructor without parameters (initialize both lists)
   *
   * - addItemInStock(name, quantity, price) -> in order to add an item we need to check first if the 
   * item has not been already added in the store's stock (iterate through the store stock and check item names)
   * if the item was already added just increment the quantity of the already added item and update the price (exit from function after)
   * if the item is not already in the list then add it by creating a new Item
   *
   * - sellItemFromStock(name, quantity) - check if the item is in stock (iterate through the store's stock)
   * and then check if the name parameter is equal to item name (item name from the list)
   * if the item needed is found then check the available quantity
   * return then total price of the sold item (multiply item price with quantity)
   *
   * - addItemToBasket(name, quantity) - check if the item is in store's stock (iterate through the store stock and check item names)
   * if the quantity in stock is greater or equal to the desired quantity then add the item 
   * in the basket list by creating a new item (a copy of the one that is in the stock) - exit method for loop after
   *
   * - buyItemsFromBasket() - returns total price of the items
   * iterate through the shopping basket and use sellItemFromStock() method and append the 
   * result to a totalPrice variable which will be returned 
   * clear the basket
   *
   */
  
  
  public static void main(String[] args) {
    
    ShoppingManager manager = new ShoppingManager();
    
    manager.addItemInStock("milk", 100, 3);
    manager.addItemInStock("tomato", 100, 2.3);
    manager.addItemInStock("bread", 50, 1);
    manager.addItemInStock("apple", 200, 1.2);
    manager.addItemInStock("bacon", 150, 6);
    manager.addItemInStock("chicken", 70, 5);
    manager.addItemInStock("cucumber", 300, 2.1);
    manager.addItemInStock("blueberries", 100, 5);

    
    manager.addItemToBasket("bacon", 5);
    manager.addItemToBasket("apple", 10);
    manager.addItemToBasket("bread", 1);
    manager.addItemToBasket("blueberries", 2);

    System.out.println("Total price paid for my basket is: " + manager.buyItemsFromBasket());
    
    
    
    
  }
}
