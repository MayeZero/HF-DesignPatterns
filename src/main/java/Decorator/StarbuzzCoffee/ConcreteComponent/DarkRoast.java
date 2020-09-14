package Decorator.StarbuzzCoffee.ConcreteComponent;

import Decorator.StarbuzzCoffee.Component.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        setDescription("Dark Roast coffee");
    }

    @Override
    public double cost() {
        return .99;
    }
}
