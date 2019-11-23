package chapter3_decorator.study2;

public class Decaf extends Beverage {

    @Override
    public float cost() {
        return 1.05f + super.cost();
    }

    @Override
    public String getDescription() {
        return "Decaf" + super.getDescription();
    }
}
