package chapter1_strategy.study1;

public abstract class Duck {

    public void quack(){
        System.out.println(this.getClass().getSimpleName() + " Quacking....");
    }

    public void swim(){
        System.out.println(this.getClass().getSimpleName() + " Swimming....");
    }

    public void fly(){
        System.out.println(this.getClass().getSimpleName() + " Flying....");
    }

    public abstract void display();
}
