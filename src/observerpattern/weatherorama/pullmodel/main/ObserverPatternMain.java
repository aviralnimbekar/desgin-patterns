package observerpattern.weatherorama.pullmodel.main;

import observerpattern.weatherorama.pullmodel.observer.CurrentConditionsDisplay;
import observerpattern.weatherorama.pullmodel.observer.ForecastDisplay;
import observerpattern.weatherorama.pullmodel.observer.HeatIndexDisplay;
import observerpattern.weatherorama.pullmodel.observer.StatisticsDisplay;
import observerpattern.weatherorama.pullmodel.subject.WeatherData;

public class ObserverPatternMain {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        new CurrentConditionsDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        new ForecastDisplay(weatherData);
        new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30);
        weatherData.setMeasurements(82, 70, 29);
        weatherData.setMeasurements(78, 90, 29);
    }

}
