package chapter1_strategy.study3;

public class Squeak implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Duck is squeaking....");
    }
}
