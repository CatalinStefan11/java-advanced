package _3_inner_class;

public class Laptop {
  double price;

  // nested class
  class Processor {

    // members of nested class
    double cores;
    String manufacturer;

    double getCache() {
      return 4.3;
    }
  }

  // nested protected class
  protected class RAM {

    // members of protected nested class
    double memory;
    String manufacturer;

    double getClockSpeed() {
      return 5.5;
    }
  }
}

class Main {
  public static void main(String[] args) {

    // create object of Outer class CPU
    Laptop cpu = new Laptop();

    // create an object of inner class Processor using outer class
    Laptop.Processor processor = cpu.new Processor();

    // create an object of inner class RAM using outer class CPU
    Laptop.RAM ram = cpu.new RAM();
    System.out.println("Processor Cache = " + processor.getCache());
    System.out.println("Ram Clock speed = " + ram.getClockSpeed());
  }
}
