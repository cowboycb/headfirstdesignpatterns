package chapter12_compoundpatterns.f_withobserver;

public class GooseAdapter implements Quackable {
    Goose goose;
    QuackObservable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
        return "Goose";
    }
}
