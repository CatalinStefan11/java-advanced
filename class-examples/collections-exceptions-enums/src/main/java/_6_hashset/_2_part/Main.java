package _6_hashset._2_part;

import java.util.HashSet;
import java.util.Set;

public class Main {


  public static void main(String[] args) {


    Set<TravelDestination> agencyDestinations = new HashSet<>();
    
    agencyDestinations.add(new TravelDestination("Amsterdam", 1_000_000, "Beautiful city with a lot of museums and tourist attractions."));
    agencyDestinations.add(new TravelDestination("Barcelona", 1_600_000, "The capital of Catalonia. Home city of FC Barcelona."));
    agencyDestinations.add(new TravelDestination("Los Angeles", 3_800_000, "A beautiful city known for its Hollywood film industry"));
    agencyDestinations.add(new TravelDestination("Kiev", 2_800_000, "The capital of a brave men state. They keep fighting for freedom."));
    agencyDestinations.add(new TravelDestination("Barcelona", 1_600_000, "The capital of Catalonia. Home city of FC Barcelona."));
    
    
    // comment and uncomment equals and hashcode
    for (TravelDestination element : agencyDestinations){
      System.out.println(element);
    }
    
    TravelDestination kievDest = new TravelDestination("Kiev", 2_800_000, "The capital of a brave men state. They keep fighting for freedom.");

    // comment and uncomment equals and hashcode
    System.out.println(agencyDestinations.contains(kievDest));
    
    
  }
}
