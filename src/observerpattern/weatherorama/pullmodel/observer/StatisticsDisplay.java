package observerpattern.weatherorama.pullmodel.observer;

import observerpattern.weatherorama.pullmodel.subject.WeatherData;

public class StatisticsDisplay implements Display, WeatherObserver {

    private final WeatherData weatherData;
    private int maxTemp = Integer.MIN_VALUE;
    private int minTemp = Integer.MAX_VALUE;
    private int tempSum = 0;
    private int numReadings = 0;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        double avgTemp = (numReadings > 0) ? (double) tempSum / numReadings : 0;
        System.out.println("Statistics: Avg Temp=" + String.format("%.1f", avgTemp) + "°F, Min=" + minTemp + "°F, Max=" + maxTemp + "°F");
        System.out.println("***********************************************************************");
    }

    @Override
    public void update() {
        int temperature = weatherData.getTemperature();
        int humidity = weatherData.getHumidity();
        int pressure = weatherData.getPressure();

        tempSum += temperature;
        numReadings++;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }

        System.out.println("***********************************************************************");
        System.out.println("[StatisticsDisplay] Weather update received: Temp=" + temperature + "°F, Humidity=" + humidity + "%, Pressure=" + pressure);

        display();
    }
}
