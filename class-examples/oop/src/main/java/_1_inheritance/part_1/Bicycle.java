package _1_inheritance.part_1;


public class Bicycle {

  // the Bicycle class has two fields
  public int gear;
  public int speed;

  // the Bicycle class has one constructor
  public Bicycle(int startSpeed, int startGear) {
    gear = startGear;
    speed = startSpeed;
  }

  public void setGear(int newValue) {
    gear = newValue;
  }

  public void applyBrake(int decrement) {
    speed -= decrement;
  }

  public void speedUp(int increment) {
    speed += increment;
  }
}