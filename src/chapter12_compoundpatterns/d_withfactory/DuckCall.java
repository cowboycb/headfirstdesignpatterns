package chapter12_compoundpatterns.d_withfactory;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
