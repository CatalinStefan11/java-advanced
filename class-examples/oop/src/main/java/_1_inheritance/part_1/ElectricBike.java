package _1_inheritance.part_1;

public class ElectricBike extends Bicycle {

  public int batteryLevel;

  public ElectricBike(int startSpeed, int startGear, int batteryLevel) {
    super(startSpeed, startGear);
    this.batteryLevel = batteryLevel;
  }

  void recharge() {
    this.batteryLevel = 100;
  }

  void useElectricPower() {
    this.batteryLevel -= 10;
    // we can use super to call the methods from the parent class
    super.speedUp(10);
  }
}
