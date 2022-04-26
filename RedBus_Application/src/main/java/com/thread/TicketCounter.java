package com.thread;

public class TicketCounter {

	private int availseats =1;

	public synchronized void bookTicket(int usrid, int noofseats) {
		if ((availseats >= noofseats) && (noofseats > 0)) {
			System.out.println("Seast booked");
			availseats = availseats - noofseats;

		} else {
			System.out.println("seat not available");
		}
	}

}
