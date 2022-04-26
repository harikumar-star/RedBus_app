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

Seat Booked
<%



System.out.println("Coming to get");


String s = request.getParameter("tick");

String k = request.getParameter("userid");

String fare = request.getParameter("fare");
System.out.println(s+"-----------------"+fare+"--------"+k);








int o = Integer.parseInt(s);
int k1 = Integer.parseInt(fare);

ArrayList<Integer> al = new ArrayList<Integer>();
al.add(2);
al.add(3);
al.add(o);

int totalfare = al.size() * k1;



for(Integer z : al)
{
	
	%>
	<%=z %>

	<%
	
	
	
}

%>

<br>

Total


<%=k1 %>




</body>
</html>