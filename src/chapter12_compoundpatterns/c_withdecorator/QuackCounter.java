package chapter12_compoundpatterns.c_withdecorator;

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
}
