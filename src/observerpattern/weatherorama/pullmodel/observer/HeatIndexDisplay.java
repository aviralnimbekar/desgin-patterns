package observerpattern.weatherorama.pullmodel.observer;

import observerpattern.weatherorama.pullmodel.subject.WeatherData;

public class HeatIndexDisplay implements Display, WeatherObserver {

    private final WeatherData weatherData;
    private int temperature;
    private int humidity;
    private int pressure;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    // some auto generated global formula, safe to ignore for this example
    private double computeHeatIndex(int t, int rh) {
        return ((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
    }

    @Override
    public void display() {
        double heatIndex = computeHeatIndex(temperature, humidity);
        System.out.println("Heat Index: " + String.format("%.2f", heatIndex) + "°F (Temp: " + temperature + "°F, Humidity: " + humidity + "%)");
        System.out.println("***********************************************************************");
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();

        System.out.println("***********************************************************************");
        System.out.println("[HeatIndexDisplay] Weather update received: Temp=" + temperature + "°F, Humidity=" + humidity + "%, Pressure=" + pressure);

        display();

    }
}
