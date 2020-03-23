package practice200322.observer;

public class TestObserver {
    public static void main(String[] args) {
        Subject sub= new MySubject();
        Observer obs1 = new ConcreteObserver("obs1");
        Observer obs2 = new ConcreteObserver("obs2");
        Observer obs3 = new ConcreteObserver("obs3");

        sub.addObserver(obs1);
        sub.addObserver(obs2);
        sub.addObserver(obs3);

        sub.operation();

    }
}
