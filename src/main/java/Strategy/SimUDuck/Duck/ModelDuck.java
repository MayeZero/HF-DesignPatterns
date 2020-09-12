package Strategy.SimUDuck.Duck;

import Strategy.SimUDuck.FlyBehavior.FlyNoWay;
import Strategy.SimUDuck.QuackBehavior.Quack;

public class ModelDuck extends Duck{
    public ModelDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    public void display(){
        System.out.println("I'm a model duck");
    }
}
