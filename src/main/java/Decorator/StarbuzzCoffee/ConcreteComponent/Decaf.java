package Decorator.StarbuzzCoffee.ConcreteComponent;

import Decorator.StarbuzzCoffee.Component.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        setDescription("Decaf Coffee");
    }

    public double cost() {
        return 1.05;
    }
}
