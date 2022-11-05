package _5_generics;

public class SoccerTeam extends Team<SoccerTeam> {
    public SoccerTeam(String name) {
        super(name);
    }
}
