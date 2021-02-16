package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Theatre {
	private String theaterName;
	private List<Seat> seats = new ArrayList<>();
	
	static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
		@Override
		public int compare (Seat seat1, Seat seat2) {
			if(seat1.price > seat2.price) {
				return 1;
			} else if (seat1.price < seat2.price) {
				return -1;
			} else {
				return 0;
			}
		}
	};
	
	Theatre(String name, int numRows, int seatsPerRow) {
		this.theaterName = name;
		int lastRow = 'A' + (numRows - 1);
		for(char row = 'A'; row <= lastRow; row++) {
			for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
				double price = 12.00;
				if((row < 'D') && (seatNum>=4 && seatNum<=9)) {
					price = 14.00;
				} else if((row > 'F') || (seatNum<4 && seatNum>9)) {
					price = 7.00;
				}
				Seat seat = new Seat(row + String.format("%02d", seatNum), price);
				seats.add(seat);
			}
		}
	}
	
	public String GetTheatreName() {
		return theaterName;
	}
	
	public boolean reserveSeat(String seatNumber) {
		Seat requestedSeat = new Seat(seatNumber);
		int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
		if(foundSeat >= 0) {
			return seats.get(foundSeat).reserve();
		} else {
			System.out.println("There is no seat " + seatNumber + " on theatre " + theaterName);
			return false;
		}
	}
	
	public Collection<Seat> getSeats() {
		return seats;
	}
	
	public class Seat implements Comparable<Seat> {
		private boolean reserved = false;
		private final String seatNumber;
		private double price;
		
		Seat(String seatNumber, double price) {
			this.seatNumber = seatNumber;
			this.price = price;
		}
		
		Seat(String seatNumber) {
			this.seatNumber = seatNumber;
		}

		public boolean isReserved() {
			return reserved;
		}

		public String getSeatNumber() {
			return seatNumber;
		}
		
		public double getPrice() {
			return price;
		}
		
		public boolean reserve() {
			if(!this.reserved) {
				this.reserved = true;
				System.out.println("Seat " + seatNumber + " reserved.");
				return true;
			} else {
				System.out.println("Seat " + seatNumber + " is already taken.");
				return false;
			}
		}
		
		public boolean cancel() {
			if(this.reserved) {
				this.reserved = true;
				System.out.println("Reservation for seat " + seatNumber + " cancelled.");
				return true;
			} else {
				System.out.println("Cannot cancel reservation because seat " + seatNumber + " wasn't reserved.");
				return false;
			}
		}

		@Override
		public int compareTo(Seat seat) {
			return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
		}
		
	}
}
