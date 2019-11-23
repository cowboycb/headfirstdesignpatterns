package chapter3_decorator.study1;

public class Espresso extends Beverage {

    @Override
    public float cost() {
        return 1.99f;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
