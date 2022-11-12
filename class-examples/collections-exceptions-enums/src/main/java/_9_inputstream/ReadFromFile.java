package _9_inputstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ReadFromFile {


  public static void main(String[] args) throws IOException {

    HashMap<Integer, String> ageToNameMap = new HashMap<>();
    
    BufferedReader br = null;
    
    try {
      br = new BufferedReader(new FileReader("C:\\Users\\cmanaila\\WorkingDir\\java-advanced\\class-examples\\collections-exceptions-enums\\src\\main\\resources\\data.txt"));
      
      String line = br.readLine();

      while (line != null) {
        
        String[] split = line.split(",");
        ageToNameMap.put(Integer.valueOf(split[0]), split[1]);
        
        line = br.readLine();
        
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      br.close();
    }


    System.out.println(ageToNameMap);


  }

}
