package chapter3_decorator.study2;

public class HouseBlend extends Beverage {

    @Override
    public float cost() {
        return 0.89f + super.cost();
    }

    @Override
    public String getDescription() {
        return "HouseBlend" + super.getDescription();
    }
}
