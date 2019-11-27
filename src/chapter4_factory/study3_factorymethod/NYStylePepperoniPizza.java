package chapter4_factory.study3_factorymethod;

public class NYStylePepperoniPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("New York style pepperoni pizza preparing...");
    }
}
