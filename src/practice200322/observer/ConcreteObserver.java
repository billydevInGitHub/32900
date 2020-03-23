package practice200322.observer;

public class ConcreteObserver implements Observer {
    private String observerName;

    public ConcreteObserver(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update() {
        System.out.println(observerName + " is updating ");
    }
}
