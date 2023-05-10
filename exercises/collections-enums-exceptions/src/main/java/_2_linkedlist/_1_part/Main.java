package _2_linkedlist._1_part;

public class Main {
  
 

  public static void main(String[] args) {
    Bakery bakery = new Bakery();
    bakery.addOrder("Baguette");
    bakery.addOrder("Croissant");
    bakery.addOrder("Pain au chocolat");

    System.out.println("Orders in the bakery:");
    bakery.printOrders();

    System.out.println("Next order: " + bakery.nextOrder());
    System.out.println("Next order: " + bakery.nextOrder());
    System.out.println("Next order: " + bakery.nextOrder());
    System.out.println("Next order: " + bakery.nextOrder());

    System.out.println("Number of orders: " + bakery.numOrders());
  }
}
