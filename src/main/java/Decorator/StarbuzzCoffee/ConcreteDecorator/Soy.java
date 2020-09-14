package Decorator.StarbuzzCoffee.ConcreteDecorator;

import Decorator.StarbuzzCoffee.Component.Beverage;
import Decorator.StarbuzzCoffee.Decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
