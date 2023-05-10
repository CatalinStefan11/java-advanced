package _6_generics.part_2;

public class SoccerTeam extends Team<SoccerTeam> {
    public SoccerTeam(String name) {
        super(name);
    }
}
