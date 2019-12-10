package chapter8_template_method.study1;

public abstract class CaffeineBeverage {

    /**
     * Template Method
     * It serves a template for an algorithm
     * Some methods are handled in this class, some are handled in the subclasses.
     */
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    protected void boilWater() {
        System.out.println("Boiling water...");
    }

    protected void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
