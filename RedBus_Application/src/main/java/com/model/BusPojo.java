package com.model;

import java.sql.Date;

public class BusPojo {

	public int getBusid() {
		return busid;
	}
	public String getBustravels() {
		return bustravels;
	}
	public String getBusname() {
		return busname;
	}
	public int getDep_hour() {
		return dep_hour;
	}
	public int getDuration() {
		return duration;
	}
	public int getArrv_hour() {
		return arrv_hour;
	}
	public int getRating() {
		return rating;
	}
	public int getFare() {
		return fare;
	}
	public int getSeats() {
		return seats;
	}
	public int getDura_hh() {
		return dura_hh;
	}
	public int getDura_min() {
		return dura_min;
	}
	public int getArrv_mm() {
		return arrv_mm;
	}
	public String getDates() {
		return dates;
	}
	public void setBusid(int busid) {
		this.busid = busid;
	}
	public void setBustravels(String bustravels) {
		this.bustravels = bustravels;
	}
	public void setBusname(String busname) {
		this.busname = busname;
	}
	public void setDep_hour(int dep_hour) {
		this.dep_hour = dep_hour;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void setArrv_hour(int arrv_hour) {
		this.arrv_hour = arrv_hour;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public void setDura_hh(int dura_hh) {
		this.dura_hh = dura_hh;
	}
	public void setDura_min(int dura_min) {
		this.dura_min = dura_min;
	}
	public void setArrv_mm(int arrv_mm) {
		this.arrv_mm = arrv_mm;
	}
	public void setDates(String string) {
		this.dates = string;
	}
	private int busid;
	private String bustravels;
	private String busname;
	
	private int dep_hour;
	private int duration;
	private int arrv_hour;
	private int rating;
	private int fare;
	private int seats;
	private int dura_hh;
	private int dura_min;
	private int arrv_mm;
	private String dates;
	private String from;
	private String ac;
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getWater() {
		return water;
	}
	public void setWater(String water) {
		this.water = water;
	}
	private String water;
	
	
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	private String to;
	
}
