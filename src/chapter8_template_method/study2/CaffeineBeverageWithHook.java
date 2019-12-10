package chapter8_template_method.study2;

public abstract class CaffeineBeverageWithHook {

    /**
     * Template Method with hook
     * It serves a template for an algorithm
     * Some methods are handled in this class, some are handled in the subclasses.
     */
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (doesCustomerWantCondiments()) {
            addCondiments();
        }
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    protected void boilWater() {
        System.out.println("Boiling water...");
    }

    protected void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * This is a hook
     * Empty default implementation. The subclass can override this method but doesn't have to.
     * @return boolean
     */
    protected boolean doesCustomerWantCondiments(){
        return true;
    }
}
