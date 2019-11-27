package chapter4_factory.study3_factorymethod;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new NYStyleCheesePizza();
        }else if ("greek".equals(type)) {
            pizza = new NYStyleGreekPizza();
        }else if ("pepperoni".equals(type)){
            pizza = new NYStylePepperoniPizza();
        }else if ("clam".equals(type)){
            pizza = new NYStyleClamPizza();
        }
        return pizza;
    }
}
