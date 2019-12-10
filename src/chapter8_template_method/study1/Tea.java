package chapter8_template_method.study1;

public class Tea extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the tea...");
    }
}
