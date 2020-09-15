package Observer.WeatherStationObservable;


import Observer.WeatherStationObservable.Display.CurrentConditionDisplay;
import Observer.WeatherStationObservable.Display.ForecastDisplay;
import Observer.WeatherStationObservable.Display.HeatIndexDisplay;
import Observer.WeatherStationObservable.Display.StatisticsDisplay;
import Observer.WeatherStationObservable.Observable.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}