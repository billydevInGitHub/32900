package practice200322.observer;

public class MySubject extends  AbstractSubject {
    @Override
    public void operation() {
        System.out.println("doing operation");
        notifyAllObservers();
    }
}
