package java_10;

class Car{
	String brand;
	String color;
	int price;
	
	public Car() {}
	
	public Car(String brand, String color, int price) {

		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println("key to start the car");
	}
	
	void engineStop() {
		System.out.println("key to stop the car");
	}
	
}

class SuperCar extends Car{
	
	String mode;

	public SuperCar() {}
	
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	
	void changeMode(String newMode) {
		this.mode = newMode;
		System.out.println("Mode Changed");
	}
	
	@Override
	void engineStart() {
		System.out.println("voice to start the car");
	}
	
	@Override
	void engineStop() {
		System.out.println("voice to stop the car");
	}
	
}

public class Casting{
	public static void main(String[] args) {
		//upcasting
		Car noOptionFerrari = new SuperCar();
//		noOptionFerrari.engineStart();
		
//		downcasting : error
//		SuperCar brokenCar = (SuperCar) new Car();
//		brokenCar.changeMode("superCar");
		
		Car car = new Car();
		SuperCar ferrari = new SuperCar();
		
		if(car instanceof Car) {
			System.out.println("nice casting");
		}else {
			System.out.println("err: wrong casting");
		}
		
		if(ferrari instanceof Car) {
			System.out.println("nice casting");
		}else {
			System.out.println("err: wrong casting");
		}
		
		if(car instanceof SuperCar) {
			System.out.println("nice casting");
		}else {
			System.out.println("err: wrong casting");
		}
		
		if(noOptionFerrari instanceof Car){
			System.out.println("nice casting");
		}else {
			System.out.println("err: wrong casting");
		}
		
	}
}





