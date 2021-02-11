package collections;

import java.util.ArrayList;
import java.util.Collections;
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
	
	public boolean reserveSeat(String seatNumber) {
		Seat requestedSeat = new Seat(seatNumber);
		int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
		if(foundSeat >= 0) {
			return seats.get(foundSeat).reserve();
		} else {
			System.out.println("There is no seat " + seatNumber + " on theatre " + theaterName);
			return false;
		}
		
		
//		for(Seat seat : seats) {
//			if(seat.getSeatNumber().equals(seatNumber)) {
//				requestedSeat = seat;
//				break;
//			}
//		}
//		if(requestedSeat == null) {
//			System.out.println("There is no seat " + seatNumber + " on theatre " + theaterName);
//			return false;
//		}
//		return requestedSeat.reserve();
	}
	
	public void getSeats() {
		for(Seat seat : seats) {
			System.out.println(seat.getSeatNumber());
		}
	}
	
	public class Seat implements Comparable<Seat> {
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
