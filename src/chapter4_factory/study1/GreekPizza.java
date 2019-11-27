package chapter4_factory.study1;

public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("greek pizza preparing...");
    }
}
