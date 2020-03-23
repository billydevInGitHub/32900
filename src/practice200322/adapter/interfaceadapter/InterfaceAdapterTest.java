package practice200322.adapter.interfaceadapter;

public class InterfaceAdapterTest {
    public static void main(String[] args) {
        Target source = new Source1();
        source.method1();
        source.method2();
    }
}
