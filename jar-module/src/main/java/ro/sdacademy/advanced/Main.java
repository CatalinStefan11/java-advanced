package ro.sdacademy.advanced;

public class Main {

  // run command
  //
  // java -Dproperty=MESSI -jar jar-module-1.0-SNAPSHOT.jar a b c

  private static int COUNTER = 0;
  
  public static void main(String[] args) {
    
    for(String arg : args){
      System.out.println("ARGUMENT NUMBER " + COUNTER + " = " + arg );
      COUNTER++;
    }

    System.out.println("ENV PROPERTY -JAVA_HOME-: " + System.getenv("JAVA_HOME"));
    System.out.println("SYSTEM PROPERTY -property-: " + System.getProperty("property"));
    
  }
}
