package chapter12_compoundpatterns.e_withcomposite;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Flock implements Quackable {
    List<Quackable> list;

    public Flock() {
        this.list = new ArrayList<>();
    }

    public void add(Quackable quackable){
        list.add(quackable);
    }

    @Override
    public void quack() {
        ListIterator<Quackable> listIterator = this.list.listIterator();
        while (listIterator.hasNext()){
            listIterator.next().quack();
        }
    }
}
