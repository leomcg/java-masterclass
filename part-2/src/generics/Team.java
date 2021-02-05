package generics;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
	String name;
	
	private int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;
	
	ArrayList<Player> members;
	
	public Team(String name) {
		this.name = name;
		this.members = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public int getPlayed() {
		return played;
	}
	
	public int getWon() {
		return won;
	}

	public int getLost() {
		return lost;
	}

	public int getTied() {
		return tied;
	}
	
	public void addPlayer(T player) {
		this.members.add(player);
	}

	public void playMatch(Team<T> opponent, int ourScore, int theirScore) {
		String message;
		if(ourScore > theirScore) {
			won++;
			message = " beat ";
		} else if (theirScore > ourScore) {
			lost++;
			message = " lost to ";
		} else {
			tied++;
			message = " tied with ";
		}
		played++;
		if(opponent != null) {
			opponent.playMatch(null, theirScore, ourScore);
			System.out.println(this.getName() + message + opponent.getName());
		}
	}
	
	public int rank() {
		return won * 3 + tied;
	}

	@Override
	public int compareTo(Team<T> otherTeam) {
		if (this.rank() > otherTeam.rank()) {
			return -1;
		} else if (this.rank() < otherTeam.rank()) {
			return 1;
		}
		return 0;
	}
	
}
