package practice200322.decorator;

public class CarDecorator implements  Car {
    Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
//        System.out.printf("this is car decorator part");
        car.assemble();
    }
}
