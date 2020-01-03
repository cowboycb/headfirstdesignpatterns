package chapter12_compoundpatterns.e_withcomposite;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory){

        Quackable mallard = duckFactory.createMallardDuck();
        Quackable redHead = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redHead);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(goose);

        Flock flockOfMallards = new Flock();
        flockOfMallards.add(mallard);
        flockOfMallards.add(duckFactory.createMallardDuck());
        flockOfMallards.add(duckFactory.createMallardDuck());

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nWhole Duck Simulator");

        simulate(flockOfDucks);

        System.out.println("\nJust Mallard Duck Simulator");
        simulate(flockOfMallards);

        System.out.println("\nThe ducks quacked " + QuackCounter.getQuackCounter() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
