package chapter1_strategy.study3;

public abstract class Duck {

    protected IFlyBehavior flyBehavior;
    protected IQuackBehavior quackBehavior;

    public void swim(){
        System.out.println(this.getClass().getSimpleName() + " Swimming....");
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
