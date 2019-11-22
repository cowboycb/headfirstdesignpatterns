package chapter1_strategy.study2;

/**
 * DecoyDuck can swim but can not quack and fly.
 */
public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Displaying DecoyDuck");
    }
}
