package chapter4_factory.study3_factorymethod;

public class ChicagoStylePepperoniPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Chicago style pepperoni pizza preparing...");
    }
}
