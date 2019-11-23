package chapter3_decorator.study3;

public class HouseBlend extends Beverage {

    @Override
    public float cost() {
        return 0.89f;
    }

    @Override
    public String getDescription() {
        return "HouseBlend";
    }
}
