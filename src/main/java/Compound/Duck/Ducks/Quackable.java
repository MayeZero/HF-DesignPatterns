package Compound.Duck.Ducks;

import Compound.Duck.Observer.QuackObservable;

public interface Quackable extends QuackObservable {
    public void quack();
}
