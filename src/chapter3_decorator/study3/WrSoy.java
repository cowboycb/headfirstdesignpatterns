package chapter3_decorator.study3;

public class WrSoy extends CondimentDecorator {

    Beverage beverage;

    public WrSoy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return 0.15f + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
