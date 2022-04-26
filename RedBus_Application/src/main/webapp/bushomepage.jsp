<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.model.BusPojo"%>
<%@page import="com.dao.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
BusPojo b = (BusPojo)request.getAttribute("data");
BusPojo b1 = (BusPojo)request.getAttribute("data1");

%>


<div align="center">

		<h1>RED BUS</h1>
		<br />
		<table border="1">
			<tr style="background-color: red; color: white;">
				<th>Bus Id</th>
				<th>BusTravels</th>
				<th>Bus Name</th>
				<th>DEP_Hour</th>
				<th>DURATION</th>
				<th>ARRI_Hour</th>
				<th>RATING</th>
				<th>FARE</th>
				<th>SEATS</th>
				<th>DURATION_HH</th>
				<th>DURA_Min</th>
				<th>DURATION_Arr</th>
				<th>DATES</th>
				<th>FROM_PLACE</th>
				<th>TO_PLACE</th>
				
				<th>STATUS</th>
				<th>AC</th>
				<th>Water</th>
				
				
			</tr>
			<%
			String name = "";
			int rollno;
			String lastname = "";
			String status = "Update";
			String status1 = "Delete";

		
			%>
			<tr>
				<td><%=b.getBusid() %></td>
				<td><%=b.getBustravels() %></td>
				<td><%=b.getBusname() %></td>
				<td><%=b.getDep_hour() %></td>
				<td><%=b.getDuration() %></td>
				<td><%=b.getArrv_hour() %></td>
				
				<td><%=b.getRating() %></td>
				<td><%=b.getFare() %></td>
				<td><%=b.getSeats() %></td>
				<td><%=b.getDura_hh() %></td>
				<td><%=b.getDura_min() %></td>
				<td><%=b.getArrv_mm() %></td>
					<td><%=b.getDates() %></td>
				<td><%=b.getFrom() %></td>
				<td><%=b.getTo() %></td>



<td>
<%      int bid = b.getBusid();
int fare = b.getFare();

int seats = b.getSeats();
%>
<p><a href="Home1?bid=<%=bid%>&seats=<%=seats%>&fare=<%=fare%>">Book</a></p>
	<td> <%=b1.getAc() %></td>
			<td> <%=b1.getWater() %></td>
				</td>
				


			</tr>
	
			
		</table>
	</div>
	
</body>
</html>