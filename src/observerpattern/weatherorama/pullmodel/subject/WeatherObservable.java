package observerpattern.weatherorama.pullmodel.subject;

import observerpattern.weatherorama.pullmodel.observer.WeatherObserver;

// This interface is called SUBJECT or OBSERVABLE
public interface WeatherObservable {

    void addObserver(WeatherObserver weatherObserver);

    void removeObserver(WeatherObserver weatherObserver);

    void notifyObserver();
}
