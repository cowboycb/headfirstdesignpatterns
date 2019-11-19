package chapter1_strategy.study2;

public abstract class Duck {

    public void swim(){
        System.out.println(this.getClass().getSimpleName() + " Swimming....");
    }

    public abstract void display();
}
