package _5_generics;

public class FootballTeam extends Team<FootballTeam> {
    public FootballTeam(String name) {
        super(name);
    }
}
