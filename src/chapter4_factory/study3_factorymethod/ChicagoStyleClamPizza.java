package chapter4_factory.study3_factorymethod;

public class ChicagoStyleClamPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Chicago style clam pizza preparing...");
    }
}
