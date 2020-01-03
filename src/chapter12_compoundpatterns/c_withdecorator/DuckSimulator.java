package chapter12_compoundpatterns.c_withdecorator;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    private void simulate(){
        Quackable mallard = new QuackCounter(new MallardDuck());
        Quackable redHead = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable goose = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");

        simulate(mallard);
        simulate(redHead);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);

        System.out.println("The ducks quacked " + QuackCounter.getQuackCounter() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
