package SimUDuck;

import SimUDuck.Duck.Duck;
import SimUDuck.Duck.MallardDuck;
import SimUDuck.Duck.ModelDuck;
import SimUDuck.FlyBehavior.FlyRocketPowered;

public class MiniDuckSimulator{
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        System.out.println("Change ModelDuck's FlyBehavior at runtime!");
        model.performQuack();
        model.performFly();
    }
}