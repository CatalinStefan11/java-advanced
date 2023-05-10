package _6_generics.part_2;

public class FootballTeam extends Team<FootballTeam> {
    public FootballTeam(String name) {
        super(name);
    }
}
