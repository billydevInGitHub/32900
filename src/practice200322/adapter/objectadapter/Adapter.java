package practice200322.adapter.objectadapter;

public class Adapter implements  Target{
    Source source = new Source();

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is implementation of method2 in Adapter");
    }

}
