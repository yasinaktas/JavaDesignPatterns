package StrategyPattern.DuckProject;

public class FlyNoWay implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I cant fly");
    }
}
