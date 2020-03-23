package practice200322.bridge;

public class MyBridge extends  Bridge {
    @Override
    public void method() {
        getSource().method();
    }
}
