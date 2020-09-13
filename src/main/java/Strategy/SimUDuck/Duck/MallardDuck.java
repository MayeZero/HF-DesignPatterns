package Strategy.SimUDuck.Duck;

import Strategy.SimUDuck.FlyBehavior.FlyWithWings;
import Strategy.SimUDuck.QuackBehavior.Quack;

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}