package Observer.WeatherStationObservable.Display;

import Observer.WeatherStationObservable.Observable.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float minTemp = 200;
    private float maxTemp = 0.0f;
    private int Tempnum = 0;
    private float sum = 0.0f;
    Observable observable;

    public StatisticsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg){
        if(observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData)observable;
            Tempnum++;
            sum += weatherData.getTemperature();

            if(weatherData.getTemperature() < minTemp){
                minTemp = weatherData.getTemperature();
            }

            if(weatherData.getTemperature() > maxTemp){
                maxTemp = weatherData.getTemperature();
            }

            display();
        }
    }

    public void display(){
        System.out.println("Avg/Max/Min temperature = " +
                sum/Tempnum + "F degrees/" + minTemp + "F degrees/" + maxTemp + "F degrees");
    }
}
