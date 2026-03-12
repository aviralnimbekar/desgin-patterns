package observerpattern.weatherorama.pullmodel.observer;

import observerpattern.weatherorama.pullmodel.subject.WeatherData;

public class CurrentConditionsDisplay implements Display, WeatherObserver {

    private int temperature;
    private int humidity;

//    later if you wanna unsubscribe at run time then will expose a method to do so
    private final WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temperature + "°F, " + humidity + "% humidity");
        System.out.println("***********************************************************************");
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();

        System.out.println("***********************************************************************");
        System.out.println("[CurrentConditionsDisplay] Weather update received: Temp=" + temperature + "°F, Humidity=" + humidity + "%");

        display();
    }
}
