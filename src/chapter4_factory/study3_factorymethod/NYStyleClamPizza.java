package chapter4_factory.study3_factorymethod;

public class NYStyleClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("New York style clam pizza preparing...");
    }
}
