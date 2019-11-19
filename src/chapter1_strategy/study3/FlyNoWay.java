package chapter1_strategy.study3;

public class FlyNoWay implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Duck can not fly....");
    }
}
