package StrategyPattern.ActionGame;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("I use knife");
    }
}
