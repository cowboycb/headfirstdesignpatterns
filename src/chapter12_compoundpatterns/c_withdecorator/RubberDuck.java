package chapter12_compoundpatterns.c_withdecorator;

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
