package chapter3_decorator.study1;

public abstract class Beverage {

    protected String description;

    public String getDescription() {
        return "Undefined";
    }

    public abstract float cost();
}
