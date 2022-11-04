package _2_linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

  
  // difference between arraylist and linkedlist with images: 
  // https://blog.devgenius.io/arraylist-or-linkedlist-choose-correct-one-e2491d586a7d
  public static void main(String[] args) {


    // create linkedlist
    Queue<String> animals = new LinkedList<>();

    // Add elements to LinkedList
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Cow");
    System.out.println("LinkedList: " + animals);
    

    LinkedList<String> languages = new LinkedList<>();

    // add elements in the linked list
    languages.add("Python");
    languages.add("Java");
    languages.add("JavaScript");
    System.out.println("LinkedList: " + languages);

    // get the element from the linked list
    String str = languages.get(1);
    System.out.print("Element at index 1: " + str);

    
    // change elements at index 3
    languages.set(2, "Kotlin");
    System.out.println("Updated LinkedList: " + languages);


    System.out.println("First item in the queue: " + languages.poll());
    
    
  }
  
}
