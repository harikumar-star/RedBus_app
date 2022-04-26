<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action ="Home" method ="post">

<input type ="hidden" name ="add" value="adding">
  <label for="busid">Bus ID:</label><br>
  <input type="number" id="fname" name="busid"><br>
  
  <label for ="">BUS TRAVELS</label><br>
  <input type="text" name="bustravels" ><br>
  
  <label for="" >BUS NAME</label><br>
  <input type ="text" name="busname"><br>
  
  <label for="" >DEPARTURE_HOUR</label><br>
<input type="number" name="departurehour"><br>

  <label for="" >DURATION</label><br>
<input type="number" name="duration"><br>


 
  <label for="" >ARRIVAL_HOUR</label><br>
<input type="number" name="arrivalhour"><br>


 
  <label for="" >RATING</label><br>
<input type="number" name="rating"><br>


 
  <label for="" >FARE</label><br>
<input type="number" name="fare"><br>


 
  <label for="" >SEATS</label><br>
<input type="number" name="seats"><br>

 
  <label for="" >DURATION_HH</label><br>
<input type="number" name="durationhh"><br>

 
  <label for="" >DURATION MIN</label><br>
<input type="number" name="durationmin"><br>



 
  <label for="" >ARRIVAL MIN</label><br>
<input type="number" name="arrivalmin"><br>

 
  <label for="" >DATE</label><br>
<input type="date" name="dates"><br>

  <label for ="">From</label><br>
  <input type="text" name="from" ><br>
  
    <label for ="">To</label><br>
  <input type="text" name="to" ><br>

<input type ="submit"   value ="ADD">
</form>


</body>
</html>