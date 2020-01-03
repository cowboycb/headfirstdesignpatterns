package chapter12_compoundpatterns.f_withobserver;

public class RedheadDuck implements Quackable {
    QuackObservable observable;

    public RedheadDuck() {
        observable = new Observable(this);
    }


    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "RedheadDuck";
    }
}
