package chapter3_decorator.study3;

public abstract class Beverage {

    private String description;

    public String getDescription() {
        return "Undefined";
    }

    public abstract float cost();
}
