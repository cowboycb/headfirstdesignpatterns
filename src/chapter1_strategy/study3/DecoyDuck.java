package chapter1_strategy.study3;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Displaying DecoyDuck");
    }
}
