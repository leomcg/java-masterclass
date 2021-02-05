package generics;

import java.util.ArrayList;

public abstract class League<T extends Team>  {
	private String name;
	private ArrayList<T> league = new ArrayList<>();
	
	public League(String name) {
		super();
		this.name = name;
	}
	
	public boolean addTeam(T team) {
		if(league.contains(team)) {
			return false;
		} else {
			league.add(team);
			return true;
		}
	}
	
	
}
