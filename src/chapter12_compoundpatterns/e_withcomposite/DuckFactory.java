package chapter12_compoundpatterns.e_withcomposite;

/**
 * Subclass of AbstractDuckFactory.
 * Creates quackable ducks.
 */
public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }
}
