package ro.sdacademy.advanced._2_solarsistem_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
  private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
  private static Set<HeavenlyBody> planets = new HashSet<>();
  private static Set<HeavenlyBody> stars = new HashSet<>();

  public static void main(String[] args) {
        /*
        
        
        Create an enum called BodyType which has the following values: STAR, PLANET, MOON, DWARF_PLANET;
        
        Create an abstract class HeavenlyBody which would be our base class that every celestial body will implement
        The class should have the following instance variables:
        - a Set of HeavenlyBody objects called satellites set
        - orbitalPeriod which is a double
        - Key (which is another class, a static nested class in the HeavenlyBody) 
            For this Key class, it should be a nested static class in the HeavenlyBody and should have the following fields:
            - String name;
            - BodyType bodyType;
            The following methods should be also included in the Key class:
            - a constructor which initialize both fields
            - getName() - getter for the name
            - getBodyType() - getter for the bodyType
            - hashCode() - method should be overridden
            - equals() - method should be overridden
            - toString() - should be also overridden
        
        The following methods should be also included in the HeavenlyBody class:
        - a constructor which takes as parameters a name(String), orbitalPeriod(double), and bodyType(BodyType) - 
        creates a new Key by calling Key's constructor and initialize the satellites set with a new HashSet<>();
        - getKey() - getter for the key
        - getOrbitalPeriod() - getter for orbitalPeriod
        - getSatellites() - getter for satellites set (use Collections.unmodifiableSet(this.satellites))
        - boolean addSatellite(HeavenlyBody moon) - add a new item to the satellites set (return true or false if the operation succeeded)
        - override equals() - it should only use keys for comparing objects
        - override hashcode() - it should only use key hashcode method
        - override toString() - print key name, bodyType and orbitalPeriod
        - create a static method called makeKey(String name, BodyType bodyType) which returns a new Key created using Key class constructor
        

        For each of the types that you support, subclass the HeavenlyBody class
        so that your program can create objects of the appropriate type.
        
        Example:
        
        public class Moon extends HeavenlyBody {
            public Moon(String name, double orbitalPeriod) {
                super(name, orbitalPeriod, BodyType.MOON);
            }
        }
        
        NOTE: You can override the addSatellites method in the above example and throw a custom Exception
        NOTE: For the Planet class override the addSatellites method and check if the satellite received as parameter is a moon, if is not a moon do not add it as a satellite
        
        
        In main create:
        - a static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem - which will contain all the bodies in the solar system
        - a static Set<HeavenlyBody> planets - which will contain only planets from the solar system
        - a static Set<HeavenlyBody> start - which will contain the stars from a solar system

      */
    
    
    HeavenlyBody temp = new Planet("Mercury", 88);
    solarSystem.put(temp.getKey(), temp);
    planets.add(temp);

    HeavenlyBody temp1 = new Planet("Venus", 225);
    solarSystem.put(temp1.getKey(), temp1);
    planets.add(temp1);


    HeavenlyBody temp2 = new Planet("Earth", 365);
    solarSystem.put(temp2.getKey(), temp2);
    planets.add(temp2);

    HeavenlyBody tempMoon = new Moon("Moon", 27);
    solarSystem.put(tempMoon.getKey(), tempMoon);
    temp2.addSatellite(tempMoon);
    
    
    HeavenlyBody temp3 = new Planet("Mars", 687);
    solarSystem.put(temp3.getKey(), temp3);
    planets.add(temp3);
    
    
    
    HeavenlyBody temp4 = new Planet("Jupiter", 4380);
    solarSystem.put(temp4.getKey(), temp4);
    planets.add(temp4);

    // moons of jupiter
    HeavenlyBody tempMoon2 = new Moon("Europa", 3.6);
    solarSystem.put(tempMoon2.getKey(), tempMoon2);
    temp4.addSatellite(tempMoon2);

    HeavenlyBody tempMoon3 = new Moon("Callisto", 17);
    solarSystem.put(tempMoon3.getKey(), tempMoon3);
    temp4.addSatellite(tempMoon3);



    HeavenlyBody temp5  = new Planet("Saturn", 11000);
    solarSystem.put(temp5.getKey(), temp5);
    planets.add(temp5);

    // moons of saturn
    tempMoon = new Moon("Titan", 16);
    solarSystem.put(tempMoon.getKey(), tempMoon);
    temp5.addSatellite(tempMoon);

    tempMoon = new Moon("Rhea", 4.5);
    solarSystem.put(tempMoon.getKey(), tempMoon);
    temp5.addSatellite(tempMoon);
    
    
    

    temp = new Planet("Uranus", 31000);
    solarSystem.put(temp.getKey(), temp);
    planets.add(temp);

    temp = new Planet("Neptune", 60200);
    solarSystem.put(temp.getKey(), temp);
    planets.add(temp);

    
    HeavenlyBody pluto = new DwarfPlanet("Pluto", 842);
    solarSystem.put(pluto.getKey(), pluto);
    planets.add(pluto);


    
    Star tempStar = new Star("Sun", 0);
    solarSystem.put(tempStar.getKey(), tempStar);
    stars.add(tempStar);


    System.out.println("Planets:");
    for (HeavenlyBody planet : planets) {
      System.out.println(planet);
    }

    System.out.println();

    System.out.println("Stars:");
    for (HeavenlyBody star : stars) {
      System.out.println(star);
    }

    System.out.println();

    Set<HeavenlyBody> moons = new HashSet<>();
    for (HeavenlyBody planet : planets) {
      moons.addAll(planet.getSatellites());
    }

    System.out.println("All Moons:");
    for (HeavenlyBody moon : moons) {
      System.out.println(moon);
    }

  }
}
