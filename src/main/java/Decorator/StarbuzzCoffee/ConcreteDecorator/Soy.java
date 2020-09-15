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
        double cost = beverage.cost();
        if(beverage.getSize() == Size.TALL){
            cost += .10;
        }else if(beverage.getSize() == Size.GRANDE){
            cost += .15;
        }else if(beverage.getSize() == Size.VENTI){
            cost += .20;
        }
        return cost;
    }
}