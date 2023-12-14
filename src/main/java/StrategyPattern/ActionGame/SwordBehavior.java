package StrategyPattern.ActionGame;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("I use sword");
    }
}
