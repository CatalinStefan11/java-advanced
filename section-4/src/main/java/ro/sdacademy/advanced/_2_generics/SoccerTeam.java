package ro.sdacademy.advanced._2_generics;

public class SoccerTeam extends Team<SoccerTeam> {
    public SoccerTeam(String name) {
        super(name);
    }
}
