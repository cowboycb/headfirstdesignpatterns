package chapter1_strategy.study2;

public class RubberDuck extends Duck implements IQuackable{

    @Override
    public void display() {
        System.out.println("Displaying RubberDuck");
    }

    @Override
    public void quack() {
        System.out.println("Squacking RubberDuck");
    }
}
