package com.thread;

public class TicketBooking extends Thread {

	private TicketCounter counter;
	private int userid;
	private int noofseatstobook;
	
	
	public TicketBooking(TicketCounter counter,int userid,int noofseatstobook)
	{
		this.counter = counter;
		this.userid = userid;
		this.noofseatstobook =noofseatstobook;
	}
	public void run()
	{
		counter.bookTicket(userid, noofseatstobook);
	}
}
