package chapter12_compoundpatterns.f_withobserver;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
