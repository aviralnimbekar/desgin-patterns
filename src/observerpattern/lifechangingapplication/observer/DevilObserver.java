package observerpattern.lifechangingapplication.observer;

import observerpattern.lifechangingapplication.observable.MyMind;

public class DevilObserver implements Observer {

    public DevilObserver(MyMind myMind) {
        myMind.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Come on, do it!");
    }
}
