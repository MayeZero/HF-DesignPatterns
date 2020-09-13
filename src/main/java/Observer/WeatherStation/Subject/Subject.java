package Observer.WeatherStation.Subject;

import Observer.WeatherStation.Observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
