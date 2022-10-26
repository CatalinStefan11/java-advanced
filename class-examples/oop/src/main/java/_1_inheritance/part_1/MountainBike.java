package _1_inheritance.part_1;

public class MountainBike extends Bicycle {

  // the MountainBike subclass adds one field
  public int seatHeight;

  /**
   * For the subclass constructor is mandatory to call the base class constructor with parameters 
   * if there isn't a no-args constructor in the superclass/baseclass. 
   * 
   * <strong>super()</strong> should be used for calling the constructor of the base class from it's subclasses
   */
  public MountainBike(int startHeight, int startSpeed, int startGear) {
    super(startSpeed, startGear);
    seatHeight = startHeight;
  }
  
  public void adjustSeatUp() {
    if(seatHeight < 5){
      seatHeight++;
    } else{
      System.out.println("Seat height is already at maximum level!");
    }
  }

  public void adjustSeatDown() {
    if(seatHeight > 0){
      seatHeight--;
    } else{
      System.out.println("Seat height is already at minimum level!");
    }
  }
  
}