package chapter4_factory.study3_factorymethod;

public class ChicagoStyleGreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Chicago style greek pizza preparing...");
    }
}
