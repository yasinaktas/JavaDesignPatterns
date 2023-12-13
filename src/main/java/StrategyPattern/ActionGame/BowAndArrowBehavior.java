package StrategyPattern.ActionGame;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("I use bow and arrow");
    }
}
