package _5_exceptions._2_;

class Order {
  private Customer customer;
  private PizzaOrder pizzaOrder;
  private double totalPrice;

  public Order(Customer customer, PizzaOrder pizzaOrder) {
    this.customer = customer;
    this.pizzaOrder = pizzaOrder;
    this.totalPrice = pizzaOrder.calculateTotalPrice();
  }

  public void submit() throws IncompleteOrderException {
    if (customer.getName() == null || customer.getPhone() == null || customer.getAddress() == null ||
        pizzaOrder == null || pizzaOrder.calculateTotalPrice() == 0) {
      throw new IncompleteOrderException("Incomplete or invalid order.");
    }
    System.out.println("Order submitted successfully.");
  }
}