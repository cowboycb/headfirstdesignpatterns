package chapter3_decorator.study3;

public class WrWhip extends CondimentDecorator {

    Beverage beverage;

    public WrWhip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return 0.10f + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
