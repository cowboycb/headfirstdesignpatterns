package chapter4_factory.study2_simplefactory;

import chapter4_factory.study2_simplefactory.inheritable_factory.ChicagoPizzaFactory;
import chapter4_factory.study2_simplefactory.inheritable_factory.NYPizzaFactory;
import chapter4_factory.study2_simplefactory.inheritable_factory.SimplePizzaFactory;

public class Test {
    public static void main(String[] args) {

        // ----------------------------------------------------
        // -- SIMPLE PIZZA FACTORY WITH FRANCHISES
        // ----------------------------------------------------
        chapter4_factory.study2_simplefactory.inheritable_factory.PizzaStore pizzaStore = new chapter4_factory.study2_simplefactory.inheritable_factory.PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("veggie");

        pizzaStore = new chapter4_factory.study2_simplefactory.inheritable_factory.PizzaStore(new NYPizzaFactory());
        pizzaStore.orderPizza("cheese");

        pizzaStore = new chapter4_factory.study2_simplefactory.inheritable_factory.PizzaStore(new ChicagoPizzaFactory());
        pizzaStore.orderPizza("clam");

        // ----------------------------------------------------
        // -- SIMPLE PIZZA FACTORY - STATIC
        // ----------------------------------------------------
        chapter4_factory.study2_simplefactory.static_factory.PizzaStore pizzaStore1 = new chapter4_factory.study2_simplefactory.static_factory.PizzaStore();

        pizzaStore1.orderPizza("cheese");

    }
}
