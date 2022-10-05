package ro.sdacademy.advanced.composition_part_2;

public class Main {

  /**
   *
   * The following exercise is for understanding composition, we will create a few classes which represents different
   * components of a PC.
   *
   * Create a class named Dimensions with the following instance variables: width, height, depth
   * The class should contain getters for all the fields.
   *
   * Create a class Case containing the following instance variables: model, manufacturer and powerSupply (all strings)
   * and dimensions which is of type Dimension
   *
   * The class should have:
   * - a constructor with parameters
   * - getters for all the fields
   * - a method pressPowerButton() - which will only print "Power button pressed" 
   *
   * 
   * Create a class resolution which will have only 2 fields: width and height (both are int)
   *
   * The class should have: 
   * - a constructor
   * - getters for both fields
   * 
   *  Create a class Monitor which will have the following fields: model, manufacturer, size (all are String)
   *  and a field nativeResolution which is of type Resolution
   * 
   * The class should have: 
   * - a constructor
   * - getters for all the fields
   * - a method named drawPixelAt(int x, int y, String color) which will only print "Drawing pixel at ... in color ..."
   *  
   *  Create a class Motherboard with the following fields: model, manufacturer, bios (all are String), 
   *  ramSlots and cardSlots (both are int)
   *  
   *  The class should have:
   *  - a constructor
   *  - getters for all the fields
   *  - a method loadProgram(programName) which will print a message when a program is loaded
   *
   *  Create a class PC which will have a case of type Case, a monitor of type Monitor and a motherboard of type Motherboard
   *
   *  The class should have:
   *  - a constructor
   *  - a method powerUp() - which will call the method for powering up from the Case class
   *  - a method drawLogo() - which will call the method drawPixel from Monitor class
   *
   */


  public static void main(String[] args) {


    Dimensions dimensions = new Dimensions(20, 20, 5);


    Case theCase = new Case("220B", "Dell", "240", dimensions);

    Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

    Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

    PC thePC = new PC(theCase, theMonitor, theMotherboard);
    thePC.powerUp();

  }
}
