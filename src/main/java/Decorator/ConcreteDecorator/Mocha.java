package Decorator.ConcreteDecorator;

import Decorator.Component.Beverage;
import Decorator.Decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 +beverage.cost();
    }
}
