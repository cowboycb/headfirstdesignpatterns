package chapter3_decorator.study1;

public class EspressoWithWhipAndMocha extends Beverage {

    private float whip = 0.10f;
    private float mocha = 0.20f;

    @Override
    public float cost() {
        return 1.99f + this.whip + this.mocha;
    }

    @Override
    public String getDescription() {
        return "Espresso, Whip, Mocha";
    }
}
