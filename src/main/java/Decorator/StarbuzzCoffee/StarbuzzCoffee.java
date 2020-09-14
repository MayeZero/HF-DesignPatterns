package Decorator.StarbuzzCoffee;

import Decorator.StarbuzzCoffee.Component.Beverage;
import Decorator.StarbuzzCoffee.ConcreteComponent.DarkRoast;
import Decorator.StarbuzzCoffee.ConcreteComponent.Espresso;
import Decorator.StarbuzzCoffee.ConcreteComponent.HouseBlend;
import Decorator.StarbuzzCoffee.ConcreteDecorator.Mocha;
import Decorator.StarbuzzCoffee.ConcreteDecorator.Soy;
import Decorator.StarbuzzCoffee.ConcreteDecorator.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $ " + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());
    }
}
