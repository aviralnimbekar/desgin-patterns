package observerpattern.weatherorama.pushmodel.observer;

import observerpattern.weatherorama.pushmodel.subject.WeatherData;

public class ForecastDisplay implements Display, WeatherObserver {

    private final WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        String forecast = "Improving weather on the way!";
        System.out.println("Forecast: " + forecast);
        System.out.println("***********************************************************************");
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {

        System.out.println("***********************************************************************");
        System.out.println("[ForecastDisplay] Weather update received: Temp=" + temperature + "°F, Humidity=" + humidity + "%");

        display();
    }
}
