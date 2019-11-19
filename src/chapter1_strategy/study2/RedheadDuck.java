package chapter1_strategy.study2;

public class RedheadDuck extends Duck implements IFlyable, IQuackable {

    @Override
    public void display() {
        System.out.println("Displaying RedheadDuck");
    }

    @Override
    public void fly() {
        System.out.println("Flying RedheadDuck");
    }

    @Override
    public void quack() {
        System.out.println("Quacking RedheadDuck");
    }
}
