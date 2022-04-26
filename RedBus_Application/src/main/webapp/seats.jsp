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
	<h1>Bus Seats</h1>
	<form action="storeseat.jsp" method="post">

		<div align="center">


			<%!%>

			<%
				ArrayList<Integer> selectseats = (ArrayList) request.getAttribute("selectseats");
			ArrayList<Integer> notselectseats = (ArrayList) request.getAttribute("notselectseats");
			String c = (String) request.getAttribute("cc");

			//add the select and non select total in arraylist

			ArrayList<Integer> selectseats1 = new ArrayList<Integer>();
			ArrayList<Integer> selectseats2 = new ArrayList<Integer>();

			try {

				bb: for (Integer a : notselectseats) {
					aa: for (Integer b : selectseats) {
				if (a == b) {
			%>
			<%=a%>

			<input type="checkbox" name="tick" disabled="disabled">


			<%
				// selected seats
			selectseats1.add(b);
			System.out.println("First Loop--------" + b);
			continue bb;
			}

			}
			// place else code here
			%>

			<%=a%>
			<input type="checkbox" name="tick" value="<%=a%>"> <input
				type="hidden" name="fare" value="<%=c%>"> 
				<input type="text" name="userid" >
				
				<input
				type="submit" value="book">
			<%
				// Not selected seats
			selectseats2.add(a);
			}

			} catch (Exception e) {
			e.printStackTrace();
			}

			System.out.println();
			%>

		</div>





		<%
			request.setAttribute("selectseats", selectseats1);
		request.setAttribute("selectseats1", selectseats2);
		%>



	</form>



</body>
</html>