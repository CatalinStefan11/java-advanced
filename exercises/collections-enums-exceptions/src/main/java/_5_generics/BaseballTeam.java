package _5_generics;

public class BaseballTeam extends Team<BaseballTeam> {
    public BaseballTeam(String name) {
        super(name);
    }
}
