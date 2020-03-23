package practice200322.decorator;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }
    public void assemble() {
        super.assemble();
        System.out.println("this is luxury car decoration<<<");
    }
}
