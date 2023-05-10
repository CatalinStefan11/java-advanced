package _5_exceptions._2_;

import java.util.List;

class PizzaOrder {
  private List<Pizza> pizzas;

  public PizzaOrder(List<Pizza> pizzas) {
    this.pizzas = pizzas;
  }

  public double calculateTotalPrice() {
    double totalPrice = 0;
    for (Pizza pizza : pizzas) {
      switch (pizza.getSize()) {
        case SMALL:
          totalPrice += 5;
          break;
        case MEDIUM:
          totalPrice += 7;
          break;
        case LARGE:
          totalPrice += 9;
          break;
      }
      
      for(Toppings t : pizza.getToppings()){
        totalPrice += t.getPrice();
      }

    }
    return totalPrice;
  }
}


