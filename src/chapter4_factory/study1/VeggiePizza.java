package chapter4_factory.study1;

public class VeggiePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("veggie pizza preparing...");
    }
}
