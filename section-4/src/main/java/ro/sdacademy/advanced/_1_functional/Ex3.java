package ro.sdacademy.advanced._1_functional;

import java.util.function.Supplier;

public class Ex3 {

  public static void main(String[] args) {
    
    
    /*
       Now write a lambda expression that maps to the java.util.Supplier interface.
       This lambda should return the string "I love Java!" Assign it to a variable called iLoveJava.
       
      
        As with Function, the Supplier won't do anything until we use it.
        Use this supplier to assign the string "I love Java!" to a variable called supplierResult.
        Then print the variable to the console.
     */
    Supplier<String> iLoveJava = () -> "I love Java!";
    String supplierResult = iLoveJava.get();
    System.out.println(supplierResult);

  }
}
