package observerpattern.weatherorama.pushmodel.subject;

import observerpattern.weatherorama.pushmodel.observer.WeatherObserver;

// This interface is called SUBJECT or OBSERVABLE
public interface WeatherObservable {

    void addObserver(WeatherObserver weatherObserver);

    void removeObserver(WeatherObserver weatherObserver);

    void notifyObserver();
}
