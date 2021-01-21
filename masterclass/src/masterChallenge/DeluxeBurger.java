package masterChallenge;

public class DeluxeBurger extends Hamburger {

	public DeluxeBurger() {
		super("Deluxe Burger", "sausage & bacon", 14.5, "white");
		super.addHamburgerAddition1("Chips", 2.7);
		super.addHamburgerAddition2("Soda", 1.8);
	}

	@Override
	public void addHamburgerAddition1(String name, double price) {
		System.out.println("Cannot add items to deluxe hamburger");
	}

	@Override
	public void addHamburgerAddition2(String name, double price) {
		System.out.println("Cannot add items to deluxe hamburger");
	}

	@Override
	public void addHamburgerAddition3(String name, double price) {
		System.out.println("Cannot add items to deluxe hamburger");
	}

	@Override
	public void addHamburgerAddition4(String name, double price) {
		System.out.println("Cannot add items to deluxe hamburger");
	}

	
	
	
	
}
