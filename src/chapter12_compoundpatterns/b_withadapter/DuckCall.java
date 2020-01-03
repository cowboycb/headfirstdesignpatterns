package chapter12_compoundpatterns.b_withadapter;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
