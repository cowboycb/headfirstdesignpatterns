package chapter1_strategy.study1;

/**
 * RubberDuck can swim, squack (not quack) but can not fly...
 */
public class RubberDuck extends Duck {

    @Override
    public void display() {
        System.out.println("Displaying RubberDuck");
    }
}
