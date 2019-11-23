package chapter3_decorator.study4;

public class WrWhip extends CondimentDecorator {

    Beverage beverage;

    public WrWhip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }

    @Override
    public float cost() {
        float c = 0.10f;
        if (getSize() == Size.TALL){
            c = 0.05f;
        }else if (getSize() == Size.VENTI){
            c = 0.15f;
        }
        return c + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
