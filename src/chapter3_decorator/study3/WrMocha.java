package chapter3_decorator.study3;

public class WrMocha extends CondimentDecorator {

    Beverage beverage;

    public WrMocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return 0.20f + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
