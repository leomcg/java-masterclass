package generics;

public class Main {
	public static void main(String[] args) {
		Team<SoccerPlayer> flamengo = new Team<>("Flamengo");
		Team<SoccerPlayer> vasco = new Team<>("Vasco");
		Team<SoccerPlayer> inter = new Team<>("Internacional");
		Team<SoccerPlayer> palmeiras = new Team<>("Palmeiras");
		SoccerPlayer gabigol = new SoccerPlayer("Gabigol");
		
		Team<BasketballPlayer> lakers = new Team<>("Lakers");
		Team<BasketballPlayer> celtics = new Team<>("Celtics");
		BasketballPlayer lebron = new BasketballPlayer("Lebron James");
		
		League<Team<SoccerPlayer>> bra = new League<>("Brasileirão");
		bra.addTeam(palmeiras);
		bra.addTeam(inter);
		bra.addTeam(vasco);
		bra.addTeam(flamengo);
		
		bra.printRanking();
		
		flamengo.addPlayer(gabigol);
		lakers.addPlayer(lebron);
		
		flamengo.playMatch(vasco, 3, 0);
		flamengo.playMatch(inter, 6, 0);
		flamengo.playMatch(palmeiras, 1, 0);
		vasco.playMatch(inter, 3, 0);
		vasco.playMatch(palmeiras, 1, 0);
		palmeiras.playMatch(inter, 1, 1);
		
		bra.printRanking();
//		System.out.println(flamengo.getName() + ": " + flamengo.rank());
//		System.out.println(vasco.getName() + ": " + vasco.rank());
//		System.out.println(palmeiras.getName() + ": " + palmeiras.rank());
//		System.out.println(inter.getName() + ": " + inter.rank());
	}
}
