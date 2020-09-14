package Decorator.StarbuzzCoffee.ConcreteComponent;

import Decorator.StarbuzzCoffee.Component.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        setDescription("House Blend Coffee");
    }

    public double cost(){
        return .89;
    }
}
