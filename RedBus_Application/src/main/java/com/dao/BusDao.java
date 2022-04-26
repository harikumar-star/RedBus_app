package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.sql.CallableStatement;
import com.model.BusPojo;

import com.utils.Dbutils;

public class BusDao {

	private int duration;
	private int durahh;
	private Connection connection;
	Date date1;

	public BusDao() {
		connection = Dbutils.getConnection();
		System.out.println(connection);
	}

	public BusPojo getPlace(String from_place, String to_place, Date dates) {

		BusPojo bpojo = new BusPojo();
		try {
			System.out.println("GET Place" + from_place + "" + to_place);

			PreparedStatement stmt1 = connection
					.prepareStatement("select * from redbus where from_place=? and to_place =? and dates =? ");
			stmt1.setString(1, from_place);
			stmt1.setString(2, to_place);
			System.out.println(dates + "==FIRST==");

			stmt1.setDate(3, dates);
			ResultSet rs = stmt1.executeQuery();
			while (rs.next()) {
				System.out.println(dates + "=Inside while==");

				bpojo.setBusid(rs.getInt(1));
				bpojo.setBustravels(rs.getString(2));
				bpojo.setBusname(rs.getString(3));
				bpojo.setDep_hour(rs.getInt(4));
				bpojo.setDuration(rs.getInt(5));
				bpojo.setArrv_hour(rs.getInt(6));
				bpojo.setRating(rs.getInt(7));
				bpojo.setFare(rs.getInt(8));
				bpojo.setSeats(rs.getInt(9));
				bpojo.setDura_hh(rs.getInt(10));
				bpojo.setDura_min(rs.getInt(11));
				bpojo.setArrv_mm(rs.getInt(12));
				// bpojo.setDates(rs.getDate(13));
				bpojo.setDates(rs.getString(13));
				bpojo.setFrom(rs.getString(14));
				bpojo.setTo(rs.getString(15));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bpojo;

	}

	public String addUser(BusPojo bus) {

		connection = Dbutils.getConnection();
		new BusDao();
		System.out.println("The connecton----" + connection);

		String status = "Success";

		duration = bus.getDep_hour() - bus.getArrv_hour();
		durahh = bus.getArrv_mm() - bus.getDura_min();
		
		
		// Neg to Pos Number
		/*
		 * int givenNumber; int positiveNumber;
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter a number: ");
		 * 
		 * givenNumber = sc.nextInt();
		 * 
		 * if (givenNumber < 0) { positiveNumber = Math.abs(givenNumber);
		 * System.out.println("Positive number: " + positiveNumber); }
		 */
		
		
		
		
		System.out.println("Dates----------" + bus.getDates());
		String str = bus.getDates();

		// Normal Conversion
		// String str="2015-03-31";
		Date date = Date.valueOf(str);// converting string into sql date
		System.out.println(date);

		try {
			PreparedStatement stmt = connection.prepareStatement(
					"insert into redbus(busid,bustravels,busname,DEPARTURE_HOUR,DURATION,ARRIVAL_HOUR,RATING,FARE,SEATS,DURATION_HH,DURATION_MIN,ARRIVAL_MIN,DATES,from_place,to_place) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,? )");
			// CallableStatement stmt=connection.prepareCall("{call
			// insertrr(?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			stmt.setInt(1, bus.getBusid());
			stmt.setString(2, bus.getBustravels());
			stmt.setString(3, bus.getBusname());
			stmt.setInt(4, bus.getDep_hour());
			stmt.setInt(5, duration);
			stmt.setInt(6, bus.getArrv_hour());
			stmt.setInt(7, bus.getRating());
			stmt.setInt(8, bus.getFare());
			stmt.setInt(9, bus.getSeats());
			stmt.setInt(10, durahh);
			stmt.setInt(11, bus.getDura_min());
			stmt.setInt(12, bus.getArrv_mm());
			stmt.setDate(13, date);
			stmt.setString(14, bus.getFrom());
			stmt.setString(15, bus.getTo());
			// stmt.execute();
			stmt.executeUpdate();

			System.out.println("success");

			System.out.println("Add sucess");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;

	}

	public BusPojo getinner(int b_id) {
		
		BusPojo binner = new BusPojo();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select r.busid,r1.bus_id,r1.ac,r1.water\r\n"
					+ "from redbus r ,redbusjoin r1\r\n"
					+ "where r.busid = r1.bus_id");
					
			while(rs.next())
			{
				
				binner.setAc(rs.getString("ac"));
				binner.setWater(rs.getString("water"));
				System.out.println(binner.getAc()+"----"+binner.getWater());
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	
	
		
		
		
		
		return binner;
	}
}
