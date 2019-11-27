package chapter4_factory.study1;

public class PepperoniPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("pepproni pizza preparing...");
    }
}
