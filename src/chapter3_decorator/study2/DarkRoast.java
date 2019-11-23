package chapter3_decorator.study2;

public class DarkRoast extends Beverage {

    @Override
    public float cost() {
        return 0.99f + super.cost();
    }

    @Override
    public String getDescription() {
        return "DarkRoast" + super.getDescription();
    }
}
