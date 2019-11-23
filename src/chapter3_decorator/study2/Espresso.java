package chapter3_decorator.study2;

public class Espresso extends Beverage {

    @Override
    public float cost() {
        return 1.99f + super.cost();
    }

    @Override
    public String getDescription() {
        return "Espresso" + super.getDescription();
    }
}
