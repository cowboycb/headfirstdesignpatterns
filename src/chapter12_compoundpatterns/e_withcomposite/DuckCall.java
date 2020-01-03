package chapter12_compoundpatterns.e_withcomposite;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
