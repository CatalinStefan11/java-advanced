package _2_writefile;

import java.util.Objects;

public class TravelDestination {
  private String cityName;
  private long population;
  private String description;

  public TravelDestination(String cityName, long population, String description) {
    this.cityName = cityName;
    this.population = population;
    this.description = description;
  }

  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public long getPopulation() {
    return population;
  }

  public void setPopulation(long population) {
    this.population = population;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return cityName + " population: " + population + " description: " + description;
  }
}
