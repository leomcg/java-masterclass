package polymorphism;


class Car {
	public String name;
	public boolean engine;
	public int cylinders;
	public int wheels;
	public Car(String name, int cylinders) {
		super();
		this.name = name;
		this.cylinders = cylinders;
		this.engine = true;
		this.wheels = 4;
	}
	public String getName() {
		return name;
	}
	public boolean isEngine() {
		return engine;
	}
	public int getCylinders() {
		return cylinders;
	}
	public int getWheels() {
		return wheels;
	}
	public void drive() {
		System.out.println(this + " - Generic car is driving");
	}
	
}

class Palio extends Car {
	public Palio() {
		super("Palio", 4);
	}
	
	public void drive() {
		System.out.println(this + " - Palio is driving");
	}
}

class bmw extends Car {
	public bmw() {
		super("bmw", 16);
	}
}

class AnyCar extends Car {
	public AnyCar() {
		super("any car", 3);
	}
}

public class Main2 {
	public static void main(String[] args) {
		Palio palio = new Palio();
		palio.drive();
		AnyCar anyCar = new AnyCar();
		anyCar.drive();
	}
}
