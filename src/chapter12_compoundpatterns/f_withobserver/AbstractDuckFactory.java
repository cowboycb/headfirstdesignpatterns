package chapter12_compoundpatterns.f_withobserver;

/**
 * This is a factory base class, subclasses of this class may behave differently.
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createRubberDuck();
    public abstract Quackable createDuckCall();
}
