package chapter4_factory.study2_simplefactory;

public class PepperoniPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("pepproni pizza preparing...");
    }
}
