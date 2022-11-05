package _6_hashset._1_part;

import java.util.HashSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) {

    HashSet<Integer> numbers = new HashSet<>();
    numbers.add(2);
    numbers.add(5);
    numbers.add(6);
    numbers.add(6);
    System.out.println("HashSet: " + numbers);

    // Using remove() method
    boolean value1 = numbers.remove(5);
    System.out.println("Is 5 removed: " + value1);

    boolean value2 = numbers.removeAll(numbers);
    System.out.println("Are all elements removed: " + value2);


    Set<String> commonNames = new HashSet<>();

    commonNames.add("Ion");
    commonNames.add("Andrei");
    commonNames.add("Andreea");
    commonNames.add("Ana");
    commonNames.add("Maria");
    commonNames.add("Andrei");

    System.out.println(commonNames);
    
    System.out.println(commonNames.contains("Ion"));
    
    System.out.println(commonNames.contains("David"));
    
    
    
  }
}
