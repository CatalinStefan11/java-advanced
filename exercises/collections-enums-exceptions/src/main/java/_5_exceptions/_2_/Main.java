package _5_exceptions._2_;

import java.util.ArrayList;
import java.util.List;

/*
    In this exercise, you will create an online ordering system for a pizza restaurant. 
    The system will consist of several classes that interact with each other to process orders, 
    calculate prices, and handle exceptions.
    
    
    Create a Toppings enum: 
    -> The Toppings enum represents the various toppings that can be added to a pizza.
    -> The enum has five constants: CHEESE, HAM, MUSHROOMS, CHICKEN, and OLIVES. Each constant represents a specific topping.
    -> Each constant has an associated price. The price is stored as a private instance variable named "price".
    -> The constructor for the enum takes an integer argument representing the price of the topping, and sets the instance variable "price" to this value.
    -> The Toppings enum provides a public method named "getPrice" that returns the price of the topping.
    -> The Toppings enum is designed to be used in conjunction with the Pizza class to calculate the price of a pizza based on the size and toppings.

    
    Create a Pizza class that has the following properties:
    -> "size" - property that is an enum with values SMALL, MEDIUM, and LARGE
    -> "toppings" - property that is a list of toppings representing the pizza toppings
    -> A constructor that initializes the size and toppings of the pizza

    Create a PizzaOrder class that has the following properties:
    -> "pizzas" property that is a list of Pizza objects representing the pizzas in the order
    -> A constructor that initializes the pizzas in the order
    -> A calculateTotalPrice method that calculates the total price of the order based on the size 
    and number of pizzas, as well as any additional charges for the toppings 
    
    
    Create a Customer class that has the following properties:
    -> A name property representing the customer's name
    -> A phone property representing the customer's phone number
    -> A address property representing the customer's address
    -> A constructor that initializes the customer's name, phone, and address


    Create an Order class that has the following properties:
    -> "customer" property representing the customer placing the order
    -> "pizzaOrder" property representing the pizzas in the order
    -> "totalPrice" property representing the total price of the order
    -> A constructor that initializes the customer, pizzaOrder, and totalPrice of the order
    -> A submit method that simulates submitting the order to the restaurant. 
    This method should throw an exception if the order is incomplete or invalid in some way.

    Create a custom exception called IncompleteOrderException that is thrown when an order 
    is incomplete or invalid in some way. This exception should have a message that describes 
    the specific problem with the order.

    In your Main class, create some sample Pizza, PizzaOrder, Customer, and Order objects. 
    Then call the submit method on the Order object and handle any IncompleteOrderException that is thrown.

 */

public class Main {
    public static void main(String[] args) {
        List<Toppings> toppings1 = new ArrayList<>();
        toppings1.add(Toppings.HAM);
        toppings1.add(Toppings.CHEESE);
        Pizza pizza1 = new Pizza(PizzaSize.MEDIUM, toppings1);

        List<Toppings> toppings2 = new ArrayList<>();
        toppings2.add(Toppings.CHICKEN);
        toppings2.add(Toppings.MUSHROOMS);
        Pizza pizza2 = new Pizza(PizzaSize.LARGE, toppings2);

        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(pizza1);
        pizzas.add(pizza2);

        PizzaOrder pizzaOrder = new PizzaOrder(pizzas);

        Customer customer = new Customer("John Doe", "555-1234", "123 Main St");

        Order order = new Order(customer, pizzaOrder);

        try {
            order.submit();
        } catch (IncompleteOrderException e) {
            System.out.println(e.getMessage());
        }
    }
}