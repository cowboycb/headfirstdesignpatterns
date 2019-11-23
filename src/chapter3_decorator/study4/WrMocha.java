package chapter3_decorator.study4;

public class WrMocha extends CondimentDecorator {

    Beverage beverage;

    public WrMocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }

    @Override
    public float cost() {
        float c = 0.20f;
        if (getSize() == Size.TALL){
            c = 0.15f;
        }else if (getSize() == Size.VENTI){
            c = 0.25f;
        }
        return c + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
