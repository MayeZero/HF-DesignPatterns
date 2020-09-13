package Observer.WeatherStation.Display;

import Observer.WeatherStation.Observer.Observer;
import Observer.WeatherStation.Subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float minTemp = 200;
    private float maxTemp = 0.0f;
    private int Tempnum = 0;
    private float sum = 0.0f;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure){
        Tempnum++;
        sum += temperature;

        if(temperature < minTemp){
            minTemp = temperature;
        }

        if(temperature > maxTemp){
            maxTemp = temperature;
        }

        display();
    }

    public void display(){
        System.out.println("Avg. temp:" + sum/Tempnum + "F degrees" + "\n" +
                "Min. temp:" + minTemp + "F degrees" + "\n" +
                "Max. temp:" + maxTemp + "F degrees");
    }
}
