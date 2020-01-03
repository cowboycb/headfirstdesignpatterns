package chapter12_compoundpatterns.b_withadapter;

public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
