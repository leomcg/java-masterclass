package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Theatre cinemark = new Theatre("Cinemark", 8, 12);
		
		cinemark.reserveSeat("D12");
		cinemark.reserveSeat("B13");
		List<Theatre.Seat> reverseSeats = new ArrayList<>(cinemark.getSeats());
		Collections.reverse(reverseSeats);
		printList(reverseSeats);
		
		List<Theatre.Seat> priceSeats = new ArrayList<>(cinemark.getSeats());
		priceSeats.add(cinemark.new Seat("B00", 13.00));
		priceSeats.add(cinemark.new Seat("A00", 13.00));
		Collections.sort(priceSeats, Theatre.PRICE_ORDER);
		printList(priceSeats);

		
	}
	
	public static void printList(List<Theatre.Seat> list) {
		for(Theatre.Seat seat : list) {
			System.out.println(seat.getSeatNumber() + " $" + seat.getPrice());
		}
		System.out.println("=================================================");
	}
}

 