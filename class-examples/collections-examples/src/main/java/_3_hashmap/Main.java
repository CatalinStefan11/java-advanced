package _3_hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {


    Map<Integer, String> employeeHashmap = new HashMap<Integer, String>();
    // Putting key-values pairs in HashMap
    employeeHashmap.put(1, "Arpit");
    employeeHashmap.put(2, "John");
    employeeHashmap.put(3, "Martin");
    employeeHashmap.put(4, "Vaibhav");

    System.out.println(employeeHashmap);


    HashMap<String, Integer> vehicleMaxSpeedMap = new HashMap<>();
    // Putting key-values pairs in HashMap

    vehicleMaxSpeedMap.put("Bike", 120);
    vehicleMaxSpeedMap.put("Car", 220);
    vehicleMaxSpeedMap.put("Truck", 160);
    vehicleMaxSpeedMap.put("Activa", 140);
    System.out.println(vehicleMaxSpeedMap);

    // Remove truck key
    Integer speed = vehicleMaxSpeedMap.remove("Truck");
    System.out.println("===============================");
    System.out.println("Vehicle Truck with max speed " + speed + " removed from HashMap");
    System.out.println(vehicleMaxSpeedMap);
    System.out.println("================================");


    HashMap<String, String> employeeMap = new HashMap<>();

    //check if map is empty
    boolean empty = employeeMap.isEmpty();
    System.out.println("is employeeMap empty: " + empty);

    // Putting key-values pairs in HashMap
    employeeMap.put("Arpit", "Tech");
    employeeMap.put("John", "Sales");
    employeeMap.put("Martin", "HR");
    employeeMap.put("Vaibhav", "Tech");

    System.out.println(employeeMap);
    //check size of map
    System.out.println("size of employeeMap: " + employeeMap.size());

    // get value from HashMap
    System.out.println("Martin's department: " + employeeMap.get("Martin"));
    // Robin's department will be null as we don't have key as "Robin"
    System.out.println("Robin's department: " + employeeMap.get("Robin"));

    if (employeeMap.containsKey("John")) {
      System.out.println("employeeMap has John as key");
    }

    if (employeeMap.containsValue("Sales")) {
      System.out.println("employeeMap has Sales as value");
    }

    // Removing all entries from Map
    employeeMap.clear();
    System.out.println(employeeMap);
  }
  

}
