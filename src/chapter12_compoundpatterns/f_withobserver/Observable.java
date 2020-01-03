package chapter12_compoundpatterns.f_withobserver;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Observable implements QuackObservable {
    private List<Observer> listObservers;
    private QuackObservable duck;

    public Observable(QuackObservable duck) {
        listObservers = new ArrayList<>();
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        listObservers.add(observer);
    }

    @Override
    public void notifyObservers() {
        ListIterator<Observer> observerListIterator = listObservers.listIterator();
        while (observerListIterator.hasNext()){
            observerListIterator.next().update(duck);
        }
    }
}
