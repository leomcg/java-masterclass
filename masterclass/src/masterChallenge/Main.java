package masterChallenge;

public class Main {
	public static void main(String[] args) {
		Hamburger hamburger = new Hamburger("Basic", "sausage", 3.56, "white");
//		double price = hamburger.itemizeHamburger();
		hamburger.addHamburgerAddition1("tomato", 0.27);
		hamburger.addHamburgerAddition2("lettuce", 0.75);
		hamburger.addHamburgerAddition3("cheese", 1.12);
		System.out.println("Total burger price is " + hamburger.itemizeHamburger());
		
		HealthyBurger healthyBurger = new HealthyBurger("bacon", 5.67);
		healthyBurger.addHamburgerAddition1("egg", 4.23);
		healthyBurger.addHealthyAddition1("lentils", 1.45);
		System.out.println("Total HEALTHY burger price is " + healthyBurger.itemizeHamburger());
	}
}
