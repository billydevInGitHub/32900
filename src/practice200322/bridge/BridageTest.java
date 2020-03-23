package practice200322.bridge;

public class BridageTest {
    public static void main(String[] args) {
        Bridge bridge= new MyBridge();
        bridge.setSource(new MySource());
        bridge.method();
    }
}
