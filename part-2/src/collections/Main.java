package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Theatre cinemark = new Theatre("Cinemark", 8, 12);
		List<Theatre.Seat> seatsCopy = new ArrayList<>(cinemark.seats);
		printList(seatsCopy);
		seatsCopy.get(1).reserve();
		cinemark.reserveSeat("A02");
		
		Collections.reverse(seatsCopy);
		Collections.shuffle(cinemark.seats);
		printList(seatsCopy);
		printList(cinemark.seats);


		
	}
	
	public static void printList(List<Theatre.Seat> list) {
		for(Theatre.Seat seat : list) {
			System.out.println(seat.getSeatNumber());
		}
		System.out.println("=================================================");
	}
}

 