package chapter3_decorator.study3;

public class Decaf extends Beverage {

    @Override
    public float cost() {
        return 1.05f;
    }

    @Override
    public String getDescription() {
        return "Decaf";
    }
}
