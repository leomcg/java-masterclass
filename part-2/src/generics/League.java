package generics;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>  {
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
	
	public void printRanking() {
		Collections.sort(league);
		for (T team : league) {
			System.out.println(team.getName() + " (" + team.getPlayed() + " games) : " + team.rank());
		}
	}
	
}
