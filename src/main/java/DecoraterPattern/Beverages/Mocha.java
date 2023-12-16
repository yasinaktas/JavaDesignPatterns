package DecoraterPattern.Beverages;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        if(beverage.getSize() == Size.TALL) return beverage.cost() + 0.10;
        if(beverage.getSize() == Size.GRANDE) return beverage.cost() + 0.20;
        if(beverage.getSize() == Size.VENTI) return beverage.cost() + 0.25;
        return beverage.cost() + 0.30;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
