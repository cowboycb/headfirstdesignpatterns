package chapter4_factory.study4_abstractfactory;

import chapter4_factory.study4_abstractfactory.ingredients.*;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
