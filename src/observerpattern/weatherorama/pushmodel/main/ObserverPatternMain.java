package observerpattern.weatherorama.pushmodel.main;

import observerpattern.weatherorama.pushmodel.observer.CurrentConditionsDisplay;
import observerpattern.weatherorama.pushmodel.observer.ForecastDisplay;
import observerpattern.weatherorama.pushmodel.observer.HeatIndexDisplay;
import observerpattern.weatherorama.pushmodel.observer.StatisticsDisplay;
import observerpattern.weatherorama.pushmodel.subject.WeatherData;

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
