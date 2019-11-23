package chapter3_decorator.study4;

public class Espresso extends Beverage {

    public Espresso() {}
    public Espresso(Size size) {
        setSize(size);
    }

    @Override
    public float cost() {
        return 1.99f;
    }

    @Override
    public String getDescription() {
        return getSize().getName() + " " + "Espresso";
    }
}
