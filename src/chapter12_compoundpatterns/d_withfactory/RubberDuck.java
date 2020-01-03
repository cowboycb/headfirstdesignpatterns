package chapter12_compoundpatterns.d_withfactory;

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
