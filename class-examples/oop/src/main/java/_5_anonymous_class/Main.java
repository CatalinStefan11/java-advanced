package _5_anonymous_class;

public class Main {

  public static void main(String[] args) {

    MyInterface instance = new MyInterface() {
      public void doIt() {
        System.out.println("Anonymous class doIt()");
      }
    };

    instance.doIt();


    final String textToPrint = "Text...";

    MyInterface anotherInstance = new MyInterface() {

      private String text;

      //static initializer
      {this.text = textToPrint;}

      public void doIt() {
        System.out.println(this.text);
      }
      
    };

    anotherInstance.doIt();
  }
}
