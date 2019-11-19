package chapter1_strategy.study2;

public class MallardDuck extends Duck implements IFlyable, IQuackable {

    @Override
    public void display() {
        System.out.println("Displaying MallardDuck");
    }

    @Override
    public void fly() {
        System.out.println("Flying MallardDuck");
    }

    @Override
    public void quack() {
        System.out.println("Quacking MallardDuck");
    }
}
