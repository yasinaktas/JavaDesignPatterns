package StrategyPattern.DuckProject;

public class ModelDuck extends Duck{

    public ModelDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {

    }
}
