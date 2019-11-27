package chapter4_factory.study3_factorymethod;

public class Test {

    public static void main(String[] args) {

        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");


        pizzaStore = new ChicagoPizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
