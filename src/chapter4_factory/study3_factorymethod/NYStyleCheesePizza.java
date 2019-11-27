package chapter4_factory.study3_factorymethod;

public class NYStyleCheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("New York style cheese pizza preparing...");
    }
}
