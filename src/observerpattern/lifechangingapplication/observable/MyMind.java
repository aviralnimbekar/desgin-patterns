package observerpattern.lifechangingapplication.observable;

import observerpattern.lifechangingapplication.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class MyMind implements Subject {

    private List<Observer> observers;

    public MyMind() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(Observer::update);
    }

    public void shouldIDo(String arg){
        System.out.println("Should I do : " +  arg);
        notifyObserver();
    }

}
