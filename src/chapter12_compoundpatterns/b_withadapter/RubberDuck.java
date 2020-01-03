package chapter12_compoundpatterns.b_withadapter;

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
