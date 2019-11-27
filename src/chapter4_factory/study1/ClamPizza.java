package chapter4_factory.study1;

public class ClamPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("clam pizza preparing...");
    }
}
