package chapter8_template_method.study1;

public class Coffee extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }
}
