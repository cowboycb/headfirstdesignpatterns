package chapter4_factory.study2_simplefactory.inheritable_factory;

import chapter4_factory.study2_simplefactory.*;

public class NYPizzaFactory extends SimplePizzaFactory {

    public Pizza createPizza(String type){
        System.out.println("NewYork style pizza factory...");
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        }else if ("greek".equals(type)) {
            pizza = new GreekPizza();
        }else if ("pepperoni".equals(type)){
            pizza = new PepperoniPizza();
        }else if ("clam".equals(type)){
            pizza = new ClamPizza();
        }else if ("veggie".equals(type)){
            pizza = new VeggiePizza();
        }
        return pizza;
    }

}
