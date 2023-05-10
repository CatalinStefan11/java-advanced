package _2_linkedlist._1_part;

import java.util.LinkedList;
import java.util.Queue;

public class Bakery {
  private Queue<String> orders;

  public Bakery() {
    orders = new LinkedList<String>();
  }

  public void addOrder(String order) {
    orders.add(order);
  }

  public String nextOrder() {
    if (orders.isEmpty()) {
      return "No orders";
    } else {
      return orders.poll();
    }
  }

  public int numOrders() {
    return orders.size();
  }

  public void printOrders() {
    for (String order : orders) {
      System.out.println(order);
    }
  }
}