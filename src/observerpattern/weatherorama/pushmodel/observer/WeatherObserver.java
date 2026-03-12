package observerpattern.weatherorama.pushmodel.observer;

public interface WeatherObserver {

    void update(int temperature, int humidity, int pressure);
}
