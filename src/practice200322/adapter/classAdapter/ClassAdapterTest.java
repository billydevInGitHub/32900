package practice200322.adapter.classAdapter;

public class ClassAdapterTest {
    public static void main(String[] args) {
        Target source = new Adapter();
        source.method1();
        source.method2();
    }
}
