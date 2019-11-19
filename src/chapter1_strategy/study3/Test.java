package chapter1_strategy.study3;

public class Test {

    public static void main(String[] args) {
        Duck[] allDucks = { new MallardDuck(), new RedheadDuck(), new RubberDuck(), new DecoyDuck(), new ModelDuck()};

        for (Duck d : allDucks) {
            d.display();
            d.performQuack();
            d.swim();
            d.performFly();
            if (d instanceof ModelDuck){
                d.setFlyBehavior(new FlyRocketPowered());
                System.out.println("After change fly behavior of model duck");
                d.performFly();
            }
            System.out.println("===========================");
        }

    }
}
