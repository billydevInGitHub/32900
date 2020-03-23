package practice200322.adapter.classAdapter;

public class Adapter extends Source implements  Target  {
    @Override
    public void method2() {
        System.out.println("this is method2 implementation in Adapter");
    }
}
