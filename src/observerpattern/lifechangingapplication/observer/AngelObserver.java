package observerpattern.lifechangingapplication.observer;

import observerpattern.lifechangingapplication.observable.MyMind;

public class AngelObserver implements Observer {

    public AngelObserver(MyMind myMind) {
        myMind.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Don’t do it, you might regret it!");
    }
}
