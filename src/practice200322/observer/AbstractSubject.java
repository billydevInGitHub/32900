package practice200322.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject implements  Subject {
    List<Observer> observerList = new ArrayList<>();


    @Override
    public void addObserver(Observer obs) {
        observerList.add(obs);

    }

    @Override
    public void removeObserver(Observer obs) {
        observerList.remove(obs);
    }

    @Override
    public abstract void operation() ;

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
