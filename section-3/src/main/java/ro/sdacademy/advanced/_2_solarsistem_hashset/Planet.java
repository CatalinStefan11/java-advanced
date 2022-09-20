package ro.sdacademy.advanced._2_solarsistem_hashset;

public class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getKey().getBodyTypes() == BodyType.MOON) {
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }
}
