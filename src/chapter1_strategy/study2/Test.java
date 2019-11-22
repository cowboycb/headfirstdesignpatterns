package chapter1_strategy.study2;

public class Test {

    public static void main(String[] args) {
        Duck[] allDucks = { new MallardDuck(), new RedheadDuck(), new RubberDuck(), new DecoyDuck()};

        for (Duck d : allDucks) {
            d.display();
            if (d instanceof IQuackable){ // Using Duck implementations is difficult because types can be vary...
                ((IQuackable)d).quack();
            }
            d.swim();
            if (d instanceof IFlyable){
                ((IFlyable)d).fly();
            }
            System.out.println("===========================");
        }

    }
}
