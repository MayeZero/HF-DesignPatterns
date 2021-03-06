package Compound.Duck.Decorator;

import Compound.Duck.Ducks.Quackable;
import Compound.Duck.Observer.Observable;
import Compound.Duck.Observer.Observer;

public class QuackCounter implements Quackable {
    Observable observable;
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck){
        this.duck = duck;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
        notifyObservers();
    }

    public static int getQuacks(){
        return numberOfQuacks;
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
