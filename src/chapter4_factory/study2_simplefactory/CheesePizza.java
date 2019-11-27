package chapter4_factory.study2_simplefactory;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("cheese pizza preparing...");
    }
}
