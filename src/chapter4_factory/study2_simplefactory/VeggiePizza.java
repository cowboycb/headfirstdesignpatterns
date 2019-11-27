package chapter4_factory.study2_simplefactory;

public class VeggiePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("veggie pizza preparing...");
    }
}
