package chapter3_decorator.study2;


public class StarbuzzCafeMain {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage.setMilk(true);
        beverage.setSoy(true);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());


        beverage = new DarkRoast();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage.setMilk(true);
        beverage.setMocha(true);

        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
