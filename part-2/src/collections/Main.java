package collections;

public class Main {
	public static void main(String[] args) {
		Theatre cinemark = new Theatre("Cinemark", 20, 20);
		cinemark.getSeats();
		cinemark.reserveSeat("A01");
		cinemark.reserveSeat("A01");
		cinemark.reserveSeat("Z01");
	}
}
