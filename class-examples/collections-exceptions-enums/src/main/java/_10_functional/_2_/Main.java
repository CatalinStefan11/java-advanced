package _10_functional._2_;

import java.util.Locale;

public class Main {

  public static void main(String[] args) {
    
    MyFuncInterface print = (String param) -> System.out.println(param);
    
    MyFuncInterface upperAndThenPrint = (String otherName) -> {
      otherName = otherName.toUpperCase();
      System.out.println(otherName);
    };
    
    
    print.execute("something");

    print.execute("something 2");


    upperAndThenPrint.execute("upper");
    
    upperAndThenPrint.execute("abc");
    
  }
  
}
