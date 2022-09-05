package ro.sdacademy.advanced;

public class EnclosingClass {

  private int counter = 0;

  public int getCounter() {
    return this.counter;
  }

  class EnclosedClass {

    void incrementCounter() {
      EnclosingClass.this.counter++;
    }

  }

}