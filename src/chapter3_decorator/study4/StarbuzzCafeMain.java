package chapter3_decorator.study4;

public class StarbuzzCafeMain {

    public static void main(String[] args) {

        Beverage beverage = new Espresso(Size.TALL);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage = new WrMocha(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());


        beverage = new DarkRoast(Size.VENTI);

        beverage = new WrSoy(beverage);
        beverage = new WrMilk(beverage);

        System.out.println(beverage.getDescription() + " $" + beverage.cost());

    }
}
