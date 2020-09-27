package Compound.MVC.Model;

import Compound.MVC.Observer.BPMObserver;
import Compound.MVC.Observer.BeatObserver;

public interface HeartModelInterface {
    int getHeartRate();

    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);
}
