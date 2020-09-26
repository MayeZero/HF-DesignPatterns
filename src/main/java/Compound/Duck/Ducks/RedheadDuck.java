package Compound.Duck.Ducks;

import Compound.Duck.Observer.Observable;
import Compound.Duck.Observer.Observer;

public class RedheadDuck implements Quackable{
    Observable observable;

    public RedheadDuck(){
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
