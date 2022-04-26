package com.thread;

public class Tesy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TicketCounter t = new TicketCounter();
		TicketBooking b = new TicketBooking(t, 1, 2);
		TicketBooking b1 = new TicketBooking(t, 1, 1);
		b.start();
		b1.start();
		
		
	}

}
