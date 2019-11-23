package chapter3_decorator.study1;

public class StarbuzzCafeMain {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        beverage1 = new DarkRoastWithWhipAndSoy();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
