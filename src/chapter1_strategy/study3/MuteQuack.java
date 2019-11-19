package chapter1_strategy.study3;

public class MuteQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Duck can not quack....");
    }
}
