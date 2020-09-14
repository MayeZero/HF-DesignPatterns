package Decorator.ConcreteComponent;

import Decorator.Component.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        setDescription("House Blend Coffee");
    }

    public double cost(){
        return .89;
    }
}
