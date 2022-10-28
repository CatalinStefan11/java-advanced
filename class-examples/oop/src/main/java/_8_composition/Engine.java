package _8_composition;

public class Engine {

    public String fuelType;
    public int horsePower;
    public int numberOfCylinders;

    public Engine(String fuelType, int horsePower, int numberOfCylinders) {
        this.fuelType = fuelType;
        this.horsePower = horsePower;
        this.numberOfCylinders = numberOfCylinders;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
            "fuelType='" + fuelType + '\'' +
            ", horsePower=" + horsePower +
            ", numberOfCylinders=" + numberOfCylinders +
            '}';
    }
}