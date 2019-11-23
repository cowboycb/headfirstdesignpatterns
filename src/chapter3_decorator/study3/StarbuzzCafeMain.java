package chapter3_decorator.study3;

public class StarbuzzCafeMain {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage = new WrMocha(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());


        beverage = new DarkRoast();

        beverage = new WrMilk(beverage);
        beverage = new WrSoy(beverage);

        System.out.println(beverage.getDescription() + " $" + beverage.cost());

    }
}
