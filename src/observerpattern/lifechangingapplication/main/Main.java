package observerpattern.lifechangingapplication.main;

import observerpattern.lifechangingapplication.observable.MyMind;
import observerpattern.lifechangingapplication.observer.AngelObserver;
import observerpattern.lifechangingapplication.observer.DevilObserver;

public class Main {

    public static void main(String[] args) {

        MyMind myMind = new MyMind();

        new DevilObserver(myMind);
        new AngelObserver(myMind);

        myMind.shouldIDo("class bunk");
    }
}
