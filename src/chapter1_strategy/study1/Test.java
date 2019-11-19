package chapter1_strategy.study1;

public class Test {

    public static void main(String[] args) {
        Duck[] allDucks = { new MallardDuck(), new RedheadDuck(), new RubberDuck()};

        for (Duck d : allDucks) {
            d.display();
            d.quack();
            d.swim();
            d.fly();
            System.out.println("===========================");
        }

    }
}
