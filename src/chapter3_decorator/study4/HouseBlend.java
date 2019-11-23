package chapter3_decorator.study4;

public class HouseBlend extends Beverage {

    public HouseBlend() { }
    public HouseBlend(Size size) {
        setSize(size);
    }

    @Override
    public float cost() {
        return 0.89f;
    }

    @Override
    public String getDescription() {
        return getSize().getName() + " " + "HouseBlend";
    }
}
