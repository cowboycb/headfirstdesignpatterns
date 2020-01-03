package chapter12_compoundpatterns.b_withadapter;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    private void simulate(){
        Quackable mallard = new MallardDuck();
        Quackable redHead = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable goose = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");

        simulate(mallard);
        simulate(redHead);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
