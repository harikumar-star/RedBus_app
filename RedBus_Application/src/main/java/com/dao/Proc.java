package com.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

public class Proc {
	public static void main(String[] args) throws Exception{  
		/*
		 * LocalDate date1 = LocalDate.of(04, 04, 21); LocalDateTime now =
		 * LocalDateTime.now(); String longFormat =
		 * date1.format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
		 * System.out.println("date in long format : " + longFormat);
		 * 
		 * String mydate ="02-Apr-21";
		 * 
		 * LocalDate date12 = LocalDate.parse(mydate); System.out.println(date12);
		 */
			 
			 
			 
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);
			 
			 ArrayList<Integer> al = new ArrayList<Integer>(20);
			 
			 for(int i = 1; i <10; i ++)
			 {
				 al.add(i);
			 }
			 
			 
			 bb:
			 for(Integer a : al)
			 {
				 aa:
				 for(Integer b : al1)
				 {
					 if( a == b)
					 {
						 System.out.println("First Loop--------"+b);
						 continue bb ;
					 }
					
					
				 }
			 System.out.println(a);
			 }
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 

		}  
}
