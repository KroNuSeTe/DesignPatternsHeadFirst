package DecoratorPattern.StarBuzzSizes;

import DecoratorPattern.StarBuzzSizes.Beverage.Size;

public class StarbuzzCoffee{
    public static void main (String args[]){
        Beverage beverage = new Espresso();
        beverage.size = Size.GRANDE;
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2.size = Size.VENTI;
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3.size = Size.TALL;
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}