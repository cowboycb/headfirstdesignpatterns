package chapter3_decorator.study1;

public class DarkRoast extends Beverage {

    @Override
    public float cost() {
        return 0.99f;
    }

    @Override
    public String getDescription() {
        return "DarkRoast";
    }
}
