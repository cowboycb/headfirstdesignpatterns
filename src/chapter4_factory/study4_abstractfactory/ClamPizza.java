package chapter4_factory.study4_abstractfactory;

public class ClamPizza extends Pizza {

	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		super(ingredientFactory);
	}

	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
	}
}
