package StrategyPattern.ActionGame;

public class Queen extends Character{

    public Queen() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    void fight() {
        System.out.println("I fight!");
    }
}
