package practice200322.adapter.objectadapter;

public class ObjectAdapterTest {
    public static void main(String[] args) {
        Target   target= new Adapter();
        target.method1();
        target.method2();

    }
}
