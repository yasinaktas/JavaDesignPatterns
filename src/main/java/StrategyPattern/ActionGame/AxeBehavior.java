package StrategyPattern.ActionGame;

public class AxeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("I use axe");
    }
}
