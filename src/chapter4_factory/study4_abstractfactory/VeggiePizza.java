package chapter4_factory.study4_abstractfactory;

public class VeggiePizza extends Pizza {

	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		super(ingredientFactory);
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
	}
}
