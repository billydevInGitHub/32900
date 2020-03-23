package practice200322.bridge;

public class MySource implements  Sourceable {
    @Override
    public void method() {
        System.out.println("this is print from my source!");
    }
}
