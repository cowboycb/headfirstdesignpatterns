package chapter3_decorator.study1;

public class DecafWithSoy extends Beverage {

    private float soy = 0.15f;

    @Override
    public float cost() {
        return 1.05f + this.soy;
    }

    @Override
    public String getDescription() {
        return "Decaf, Soy";
    }
}
