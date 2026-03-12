package observerpattern.weatherorama.pushmodel.subject;

import observerpattern.weatherorama.pushmodel.observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements WeatherObservable {

    private final List<WeatherObserver> weatherObservers;

    private int temperature;
    private int humidity;
    private int pressure;

    public WeatherData() {
        this.weatherObservers = new ArrayList<>();
    }

    @Override
    public void addObserver(WeatherObserver weatherObserver) {
        weatherObservers.add(weatherObserver);
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        weatherObservers.remove(weatherObserver);
    }

    @Override
    public void notifyObserver() {
        weatherObservers.forEach(observer -> observer.update(
                temperature,
                humidity,
                pressure)
        );
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
