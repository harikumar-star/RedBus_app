package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home1
 */
public class Home1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int i = 0;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Home1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String a = request.getParameter("bid");
		String b = request.getParameter("seats");
		String c = request.getParameter("fare");
		

		System.out.println(a + "----------" + b);
		ArrayList<Integer> availseat = new ArrayList<Integer>();
		ArrayList<Integer> bookseat2 = new ArrayList<Integer>();
		ArrayList<Integer> bookseat1 = new ArrayList<Integer>();
		ArrayList<Integer> bookedseats = new ArrayList<Integer>();

		try {

			int seat = Integer.parseInt(b);
			System.out.println(seat);
			for (int i = 1; i <= seat; i++) {
				availseat.add(i);
			}
			bb: for (Integer a1 : availseat) {
				aa: for (Integer b1 : bookedseats) {
					if (a1 == b1) {

						bookseat1.add(b1);
						System.out.println("First Loop----Selected seats----" + b1);
						continue bb;
					}

				}
				System.out.println("Not select button--------" + a1);
				bookseat2.add(a1);
			}
		}

		catch (Exception r) {
			r.printStackTrace();

		}

		
		 RequestDispatcher view = request.getRequestDispatcher("seats.jsp");
		 request.setAttribute("cc", c);
		 request.setAttribute("selectseats", bookseat1); 
		 request.setAttribute("notselectseats", bookseat2);
		
		 view.forward(request, response);
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		
	
	
		

	}

}
