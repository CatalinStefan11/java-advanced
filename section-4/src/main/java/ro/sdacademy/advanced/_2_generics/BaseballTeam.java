package ro.sdacademy.advanced._2_generics;

public class BaseballTeam extends Team<BaseballTeam> {
    public BaseballTeam(String name) {
        super(name);
    }
}
