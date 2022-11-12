package _2_writefile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {


  /**
   * Create a class TravelDestination with the following instance variables: cityName - String,
   * population - long, description - String
   * 
   * Create the following methods:
   * - constructor
   * - getters/setters
   * 
   * Create a class main with a List of TravelDestination as static member
   * Use static initializer to add elements to the list
   * 
   * Use a BufferedWriter which will wrap a FileWriter and write the collection of destinations to a file 
   * (separate the values with comma)
   * 
   * Hint: 
   * -> Do not forget to proper close the bufferReader
   */
  
  
  
  static List<TravelDestination> destinationsList = new ArrayList<>();

  static {
    destinationsList.add(new TravelDestination("Amsterdam", 1_000_000, "Beautiful city with a lot of museums and tourist attractions."));
    destinationsList.add(new TravelDestination("Barcelona", 1_600_000, "The capital of Catalonia. Home city of FC Barcelona."));
    destinationsList.add(new TravelDestination("Los Angeles", 3_800_000, "A beautiful city known for its Hollywood film industry"));
    destinationsList.add(new TravelDestination("Kiev", 2_800_000, "The capital of a brave men state. They keep fighting for freedom."));
  }


  public static void main(String[] args) {

    BufferedWriter bf = null;
    try {
      bf = new BufferedWriter(new FileWriter("exercises/multithreading-functional-IO/src/main/resources/locations.txt"));
      for (TravelDestination destination : destinationsList) {
        bf.write(destination.getCityName() + "," + 
            destination.getPopulation() + "," + destination.getDescription() + "\n");
      }
    } catch (IOException e) {
      System.out.println("In catch block");
      e.printStackTrace();
    } finally {
      System.out.println("in finally block");
      try {
        if (bf != null) {
          System.out.println("Attempting to close buffered writer");
          bf.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
  
}
