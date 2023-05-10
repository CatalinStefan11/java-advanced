package _6_generics.part_2;

public class BaseballTeam extends Team<BaseballTeam> {
    public BaseballTeam(String name) {
        super(name);
    }
}
