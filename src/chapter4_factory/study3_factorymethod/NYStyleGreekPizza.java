package chapter4_factory.study3_factorymethod;

public class NYStyleGreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("New York style greek pizza preparing...");
    }
}
