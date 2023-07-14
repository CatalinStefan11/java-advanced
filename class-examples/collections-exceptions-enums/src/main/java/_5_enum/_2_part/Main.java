package _5_enum._2_part;

public class Main {

  public static void main(String[] args) {
    
    
    Coffee latte = Coffee.LATTE;

    System.out.println("Order of latte is: " + latte.ordinal());

    System.out.println("The following coffee " + Coffee.ESPRESSO + " has price: " + Coffee.ESPRESSO.getPrice() 
        + " and description: " + Coffee.ESPRESSO.getDescription());
    
    
    Coffee americano = Coffee.valueOf("AMERICANO");

    System.out.println("The following coffee " + americano + " has price: " + americano.getPrice()
        + " and description: " + americano.getDescription());
    
  }
}
