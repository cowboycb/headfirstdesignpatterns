package chapter4_factory.study2_simplefactory;

public class ClamPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("clam pizza preparing...");
    }
}
