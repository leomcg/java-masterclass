package masterChallenge;

public class Hamburger {
	private String name;
	private String meat;
	private double price;
	private String breadRoll;
	
	private String addition1Name;
	private double addition1Price;
	
	private String addition2Name;
	private double addition2Price;
	
	private String addition3Name;
	private double addition3Price;
	
	private String addition4Name;
	private double addition4Price;
	
	public Hamburger(String name, String meat, double price, String breadRoll) {
		super();
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.breadRoll = breadRoll;
	}
	
	public void addHamburgerAddition1(String name, double price) {
		this.addition1Name = name;
		this.addition1Price = price;
	}
	
	public void addHamburgerAddition2(String name, double price) {
		this.addition2Name = name;
		this.addition2Price = price;
	}
	
	public void addHamburgerAddition3(String name, double price) {
		this.addition3Name = name;
		this.addition3Price = price;
	}
	
	public void addHamburgerAddition4(String name, double price) {
		this.addition4Name = name;
		this.addition4Price = price;
	}
	
	public double itemizeHamburger() {
		double hamburgerPrice = this.price;
		System.out.println(this.name + " hamburger with " + this.meat + " on a " + this.breadRoll + " roll price is " + this.price);
		
		if(this.addition1Name != null) {
			hamburgerPrice += this.addition1Price;
			System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price + " dollars.");
		}
		
		if(this.addition2Name != null) {
			hamburgerPrice += this.addition2Price;
			System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price + " dollars.");
		}
		
		if(this.addition3Name != null) {
			hamburgerPrice += this.addition3Price;
			System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price + " dollars.");
		}
		
		if(this.addition4Name != null) {
			hamburgerPrice += this.addition4Price;
			System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price + " dollars.");
		}
		
		return hamburgerPrice;
		
	}
	
}
