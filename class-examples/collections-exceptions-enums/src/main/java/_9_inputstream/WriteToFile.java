package _9_inputstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteToFile {
  public static void main(String[] args) throws IOException {

    List<String> list = new ArrayList<>();
    list.add("string 1\n");
    list.add("string 2\n");
    list.add("string 3\n");
    list.add("string 4\n");

    BufferedWriter bf = null;

    try {
      bf = new BufferedWriter(new FileWriter("C:\\Users\\cmanaila\\WorkingDir\\java-advanced\\class-examples\\collections-exceptions-enums\\src\\main\\resources\\user_output.txt"));

      for (String el : list) {
        bf.write(el);
      }

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      bf.close();
    }


  }
}
