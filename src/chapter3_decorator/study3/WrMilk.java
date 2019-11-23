package chapter3_decorator.study3;

public class WrMilk extends CondimentDecorator {

    Beverage beverage;

    public WrMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return 0.10f + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
