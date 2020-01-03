package chapter12_compoundpatterns.c_withdecorator;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
