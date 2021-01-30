package interfacesAndAbstractClasses;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
	private String name;
	private int hitPoints;
	private int strength;
	private String weapon;
	
	
	

	public Player(String name, int hitPoints, int strength) {
		super();
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.weapon = "Sword";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Player [\n name=" + name + 
				",\n hitPoints=" + hitPoints +
				",\n strength=" + strength +
				",\n weapon=" + weapon + "\n]";
	}

	@Override
	public List<String> write() {
		List<String> values = new ArrayList<>();
		values.add(0, this.name);
		values.add(1, this.weapon);
		values.add(2, "" + this.hitPoints);
		values.add(3, "" + this.strength);
		
		return values;
	}

	@Override
	public void read(List<String> savedValues) {
		if(savedValues != null && savedValues.size() > 0) {
			this.name = savedValues.get(0);
			this.weapon = savedValues.get(1);
			this.hitPoints = Integer.parseInt(savedValues.get(2));
			this.strength = Integer.parseInt(savedValues.get(3));
		}
		
	}
	
}
