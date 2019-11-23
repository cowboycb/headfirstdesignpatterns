package chapter3_decorator.study1;

public class DarkRoastWithWhipAndSoy extends Beverage {

    private float whip = 0.10f;
    private float soy = 0.15f;

    @Override
    public float cost() {
        return 0.99f + this.soy + this.whip;
    }

    @Override
    public String getDescription() {
        return "DarkRoast, Whip, Soy";
    }
}
