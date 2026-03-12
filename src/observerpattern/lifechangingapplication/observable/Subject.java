package observerpattern.lifechangingapplication.observable;

import observerpattern.lifechangingapplication.observer.Observer;

public interface Subject {

    void addObserver(Observer observer);

    void notifyObserver();
}
