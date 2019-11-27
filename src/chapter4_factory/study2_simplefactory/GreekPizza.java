package chapter4_factory.study2_simplefactory;

public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("greek pizza preparing...");
    }
}
