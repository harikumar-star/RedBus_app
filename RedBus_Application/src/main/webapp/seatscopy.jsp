<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!int i;%>
	<div align="center">

		<%
		
		int bid = Integer.parseInt(request.getParameter("bid"));
		int seats =Integer.parseInt(request.getParameter("seats"));
		System.out.println(bid+""+seats);
		
			ArrayList<Integer> al = new ArrayList<Integer>(); //seats object 
		ArrayList<Integer> al1 = new ArrayList<Integer>(); // already booked seated
		al1.add(1);
		al1.add(2);

		for (i = 1; i <= seats; i++) {
			al.add(i);
		}

		for (Integer x : al) {
		%>
		<%=x%>
		<%
			if (x == 1) {
		%>

		<input type="checkbox" name="tick" disabled="disabled">

		<%
			} else {
		%>

		<input type="checkbox" name="tick"> 

		<%
			}

		}
		%>

	</div>







</body>
</html>