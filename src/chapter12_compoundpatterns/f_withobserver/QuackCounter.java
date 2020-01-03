package chapter12_compoundpatterns.f_withobserver;

public class QuackCounter implements Quackable {
    private Quackable quackable;
    private static int quackCounter;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackCounter++;
        quackable.quack();
    }

    public static int getQuackCounter() {
        return quackCounter;
    }

    @Override
    public void registerObserver(Observer observer) {
        quackable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quackable.notifyObservers();
    }
}
