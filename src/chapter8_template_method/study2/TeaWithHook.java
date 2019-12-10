package chapter8_template_method.study2;

public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the tea...");
    }
}
