package chapter1_strategy.study3;

public class FlyRocketPowered implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Duck is flying with rocket power....");
    }
}
