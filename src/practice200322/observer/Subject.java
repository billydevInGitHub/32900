package practice200322.observer;

public interface Subject {
    void addObserver(Observer obs);
    void removeObserver(Observer obs);
    void operation();
    void notifyAllObservers();
}
