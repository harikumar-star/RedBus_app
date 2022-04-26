package com.controller;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.dao.BusDao;
import com.model.BusPojo;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final static Logger log = Logger.getLogger(Home.class);
	BusDao dao;
	int b_id;

	public Home() {
		super();
		// TODO Auto-generated constructor stub
		dao = new BusDao();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String action = request.getParameter("action");
		// response.getWriter().print("Hello "+ name + "!!");
		System.out.println(action);

		RequestDispatcher rd = request.getRequestDispatcher("insert.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action1 = request.getParameter("add");
		System.out.println(action1);

		BusPojo bus = new BusPojo();
		if (action1.equalsIgnoreCase("adding")) {
			bus.setBusid(Integer.parseInt(request.getParameter("busid")));
			bus.setBustravels("bustravels");
			bus.setBusname("busname");
			bus.setDep_hour(Integer.parseInt(request.getParameter("departurehour")));
			bus.setDuration(Integer.parseInt(request.getParameter("duration")));
			bus.setArrv_hour(Integer.parseInt(request.getParameter("arrivalhour")));
			bus.setRating(Integer.parseInt(request.getParameter("rating")));
			bus.setFare(Integer.parseInt(request.getParameter("fare")));
			bus.setSeats(Integer.parseInt(request.getParameter("seats")));
			bus.setDura_hh(Integer.parseInt(request.getParameter("durationhh")));
			bus.setDura_min(Integer.parseInt(request.getParameter("durationmin")));
			bus.setArrv_mm(Integer.parseInt(request.getParameter("arrivalmin")));
			bus.setDates(request.getParameter("dates"));
			bus.setFrom(request.getParameter("from"));
			bus.setTo(request.getParameter("to"));

			String status = dao.addUser(bus);
			System.out.println(status);
			RequestDispatcher rd = request.getRequestDispatcher("insert.jsp");
			rd.forward(request, response);
		} else if (action1.equalsIgnoreCase("search")) {
			String from = request.getParameter("from");
			String to = request.getParameter("to");
			String mydate = request.getParameter("mydate");
			BasicConfigurator.configure();
			log.info("Ok");

			/*
			 * LocalDate date1 = LocalDate.parse(mydate);
			 * 
			 * String longFormat = date1.format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
			 * System.out.println("date in long format : " + longFormat);
			 */

			Date date = Date.valueOf(mydate);// converting string into sql date
			System.out.println(date);

			BusPojo p = new BusPojo();
			BusPojo p1_join = new BusPojo();
			p = dao.getPlace(from, to, date);
			
			//Getting the bus id fro inner join query
			b_id = p.getBusid();
			p1_join = dao.getinner(b_id);
			System.out.println("bpojo1---------"+p1_join);
			
			

			//System.out.println(p.getFrom() + "" + p;.getDates())
			
			
			
			
			
			request.setAttribute("data1", p1_join);
			request.setAttribute("data", p);
			RequestDispatcher rd = request.getRequestDispatcher("bushomepage.jsp");
			rd.forward(request, response);

		}

	}

}
