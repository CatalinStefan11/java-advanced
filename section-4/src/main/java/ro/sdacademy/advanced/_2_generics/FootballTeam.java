package ro.sdacademy.advanced._2_generics;

public class FootballTeam extends Team<FootballTeam> {
    public FootballTeam(String name) {
        super(name);
    }
}
