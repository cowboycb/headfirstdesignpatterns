package chapter8_template_method;

import chapter8_template_method.study1.CaffeineBeverage;
import chapter8_template_method.study1.Coffee;
import chapter8_template_method.study1.Tea;
import chapter8_template_method.study2.CaffeineBeverageWithHook;
import chapter8_template_method.study2.CoffeeWithHook;
import chapter8_template_method.study2.TeaWithHook;

public class Test {

    public static void main(String[] args) {

        CaffeineBeverage beverage = new Tea();
        beverage.prepareRecipe();

        beverage = new Coffee();
        beverage.prepareRecipe();

        System.out.println("=====> Template Method implementation with hook: ");

        CaffeineBeverageWithHook beverageHook = new TeaWithHook();
        beverageHook.prepareRecipe();

        beverageHook = new CoffeeWithHook();
        beverageHook.prepareRecipe();
    }
}
