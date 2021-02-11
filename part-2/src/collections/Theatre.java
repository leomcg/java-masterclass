package collections;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
	private String theaterName;
	private List<Seat> seats = new ArrayList<>();
	
	Theatre(String name, int numRows, int seatsPerRow) {
		this.theaterName = name;
		int lastRow = 'A' + (numRows - 1);
		for(char row = 'A'; row <= lastRow; row++) {
			for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
				Seat seat = new Seat(row + String.format("%02d", seatNum));
				seats.add(seat);
			}
		}
	}
	
	public String GetTheatreName() {
		return theaterName;
	}
	
	public void getSeats() {
		for(Seat seat : seats) {
			System.out.println(seat.getSeatNumber());
		}
	}
	
	public class Seat {
		private boolean reserved = false;
		private String seatNumber;
		
		Seat(String seatNumber) {
			this.seatNumber = seatNumber;
		}

		public boolean isReserved() {
			return reserved;
		}

		public String getSeatNumber() {
			return seatNumber;
		}
		
		public boolean reserve() {
			if(!this.reserved) {
				this.reserved = true;
				System.out.println("Seat " + seatNumber + " reserved.");
				return true;
			} else {
				System.out.println("Seat " + seatNumber + " is taken.");
				return false;
			}
		}
		
		public boolean cancel() {
			
		}
		
	}
}
