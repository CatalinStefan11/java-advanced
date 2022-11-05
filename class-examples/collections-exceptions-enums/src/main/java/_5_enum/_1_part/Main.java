package _5_enum._1_part;

public class Main {

  public static void main(String[] args) {
    
    Coffee myCoffee = Coffee.AMERICANO;
    
    Coffee otherCoffee = Coffee.LATTE;

    System.out.println(myCoffee);

    System.out.println(otherCoffee);
    
    
    // enum from string
    Coffee.valueOf("AMERICANO");
    
    
    Coffee espresso = Coffee.ESPRESSO;

    System.out.println("Ordinal value of espresso is: " + espresso.ordinal());
    
  }
  
  
}
