package generics;

public class Main {
	public static void main(String[] args) {
		Team<SoccerPlayer> flamengo = new Team<>("Flamengo");
		Team<SoccerPlayer> vasco = new Team<>("Vasco");
		SoccerPlayer gabigol = new SoccerPlayer("Gabigol");
		
		Team<BasketballPlayer> lakers = new Team<>("Lakers");
		Team<BasketballPlayer> celtics = new Team<>("Celtics");
		BasketballPlayer lebron = new BasketballPlayer("Lebron James");
		
		
		flamengo.addPlayer(gabigol);
		lakers.addPlayer(lebron);
		
		flamengo.playMatch(vasco, 3, 0);
		flamengo.playMatch(vasco, 6, 0);
		System.out.println(flamengo.getWon());
	}
}
