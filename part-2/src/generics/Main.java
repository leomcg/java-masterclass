package generics;

public class Main {
	public static void main(String[] args) {
		Team<SoccerPlayer> flamengo = new Team<>("Flamengo");
		Team<SoccerPlayer> vasco = new Team<>("Vasco");
		Team<SoccerPlayer> inter = new Team<>("Internacional");
		SoccerPlayer gabigol = new SoccerPlayer("Gabigol");
		
		Team<BasketballPlayer> lakers = new Team<>("Lakers");
		Team<BasketballPlayer> celtics = new Team<>("Celtics");
		BasketballPlayer lebron = new BasketballPlayer("Lebron James");
		
		
		flamengo.addPlayer(gabigol);
		lakers.addPlayer(lebron);
		
		flamengo.playMatch(vasco, 3, 0);
		flamengo.playMatch(inter, 6, 0);
		vasco.playMatch(inter, 3, 0);
		System.out.println(flamengo.getName() + ": " + flamengo.rank());
		System.out.println(vasco.getName() + ": " + vasco.rank());
		System.out.println(inter.getName() + ": " + inter.rank());
	}
}
