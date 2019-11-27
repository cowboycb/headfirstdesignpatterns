package chapter4_factory.study1;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("cheese pizza preparing...");
    }
}
