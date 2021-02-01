package interfacesAndAbstractClasses;

import java.util.ArrayList;

public class Gearbox {
	private ArrayList<Gear> gears;
	private int maxGears;
	private int gearNumber = 0;
	
	public Gearbox(int maxGears) {
		super();
		this.maxGears = maxGears;
		this.gears = new ArrayList<Gear>();
		Gear neutral = new Gear(0, 0.0);
		this.gears.add(neutral);
	}
	
	public class Gear {
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
