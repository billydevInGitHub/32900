package b32900_Exp024_BuilderPattern;

class Car {
	int wheelNumber;
	String color; 
	
	public Car ( int wheelNumber, String color) {
		this.wheelNumber=wheelNumber;
		this.color=color; 
	}
	
	public String toString() {
		return "[wheel number:"+wheelNumber+" color:"+color+"]"; 
	}

}


class CarBuilder{
	int wheelNumber; 
	String color; 

	public CarBuilder setWheelNumber(int wheelNumber) {
		this.wheelNumber=wheelNumber; 
		return this; 
	}
	
	public CarBuilder setColor(String color) {
		this.color=color; 
		return this; 
	}
	
	public Car buildCar() {
		return new Car(wheelNumber, color); 
	}
}

public class Client{
	public static void main(String[] args) {
		Car car=new CarBuilder().setWheelNumber(4).setColor("Silver").buildCar();
		System.out.println(car);
		
	}
}