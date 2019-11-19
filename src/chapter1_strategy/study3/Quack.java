package chapter1_strategy.study3;

public class Quack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Duck is quacking....");
    }
}
