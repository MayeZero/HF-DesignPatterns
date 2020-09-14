package Decorator.StarbuzzCoffee.ConcreteDecorator;

import Decorator.StarbuzzCoffee.Component.Beverage;
import Decorator.StarbuzzCoffee.Decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
