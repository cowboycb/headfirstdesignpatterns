package chapter4_factory.study2_simplefactory.static_factory;

import chapter4_factory.study2_simplefactory.*;

public class StaticSimplePizzaFactory {

    public static Pizza createPizza(String type){
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
