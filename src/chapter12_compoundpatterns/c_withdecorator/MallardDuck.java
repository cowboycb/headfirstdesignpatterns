package chapter12_compoundpatterns.c_withdecorator;

public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
