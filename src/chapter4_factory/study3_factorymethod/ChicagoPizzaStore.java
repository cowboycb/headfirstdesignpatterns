package chapter4_factory.study3_factorymethod;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
        }else if ("greek".equals(type)) {
            pizza = new ChicagoStyleGreekPizza();
        }else if ("pepperoni".equals(type)){
            pizza = new ChicagoStylePepperoniPizza();
        }else if ("clam".equals(type)){
            pizza = new ChicagoStyleClamPizza();
        }
        return pizza;
    }
}
