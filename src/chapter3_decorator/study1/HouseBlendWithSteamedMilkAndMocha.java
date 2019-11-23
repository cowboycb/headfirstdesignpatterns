package chapter3_decorator.study1;

public class HouseBlendWithSteamedMilkAndMocha extends Beverage {

    private float mocha = 0.20f;
    private float milk = 0.10f;

    @Override
    public float cost() {
        return 0.89f + this.mocha + this.milk;
    }

    @Override
    public String getDescription() {
        return "HouseBlend, Steamed Milk, Mocha";
    }
}
