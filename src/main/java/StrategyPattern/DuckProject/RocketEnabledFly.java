package StrategyPattern.DuckProject;

public class RocketEnabledFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Fly with Rocket");
    }
}
