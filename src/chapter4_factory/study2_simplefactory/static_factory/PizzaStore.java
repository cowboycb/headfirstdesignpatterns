package chapter4_factory.study2_simplefactory.static_factory;

import chapter4_factory.study2_simplefactory.Pizza;

public class PizzaStore {

    public Pizza orderPizza(String type){
        System.out.println("General static pizza factory...");
        Pizza pizza = StaticSimplePizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
