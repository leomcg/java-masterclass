package interfacesAndAbstractClasses;

import java.util.ArrayList;

public class Gearbox {
	private ArrayList<Gear> gears;
	private int maxGears;
	private int currentGear = 0;
	
	public Gearbox(int maxGears) {
		super();
		this.maxGears = maxGears;
		this.gears = new ArrayList<Gear>();
		Gear neutral = new Gear(0, 0.0);
		this.gears.add(neutral);
	}
	
	public void addGear(int number, double ratio) {
		if(number > 0 && number <= maxGears) {
			this.gears.add(new Gear(number, ratio));
		}
	}
	
	public void changeGear(int newGear) {
		if(newGear >= 0 && newGear < this.gears.size()) {
			this.currentGear = newGear;
		}
	}
	
	
	
	private class Gear {
		int gearNumber;
		private double ratio;
		public Gear(int gearNumber, double ratio) {
			super();
			this.gearNumber = gearNumber;
			this.ratio = ratio;
		}
		
		public double driveSpeed(int revs) {
			return revs * this.ratio;
		}
	}
}
