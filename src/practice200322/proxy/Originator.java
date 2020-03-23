package practice200322.proxy;

public class Originator implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is original implementation");
    }
}
