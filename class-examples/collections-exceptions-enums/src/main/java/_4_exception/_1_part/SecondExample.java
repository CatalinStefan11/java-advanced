package _4_exception._1_part;

import java.util.Scanner;

public class SecondExample {

  public static void main(String[] args) {

    // without try - catch
    Scanner reader = new Scanner(System.in);
    
    {
 
      System.out.print("Give a number: ");

      // introduce a string from the keyboard
      int readNumber = Integer.parseInt(reader.nextLine());

    }
    
    {
      System.out.print("Give a number: ");
      int readNumber = -1;

      try {
        readNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Good job!");
      } catch (Exception e) {
        System.out.println("User input was not a numer.");
      }
      
    }

   
    
    
  }
}
