<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 Example</title>
<link rel="stylesheet" href="css/login.css">
</head>
<body>
<h2>Flight Search</h2>

<form:form action="flightsearch.html"  commandName="searchForm">
	<table cellpadding="5">
		<tr>
			<td>
			<label>Destination :</label>
			<form:errors
				path="destination" />
				</td>
		
		
			<td>
			<span class="inputSpan">* </span>
			<form:input path="destination" />
			</td>
		</tr>
		<tr>
			<td><label>Arrival :</label>
			<form:errors
				path="arrival" />
				</td>
		
			<td>
			<span class="inputSpan">* </span>
			<form:input path="arrival" />
			</td>
		</tr>
		<tr>
			<td><label>Date :</label>
			<form:errors
				path="date" />
				</td>
		
			<td>
			<span class="inputSpan">* </span>
			<form:input path="date" />
			</td>
		</tr>
		<tr>
			<td><label>Flight Class :</label>
			<form:errors
				path="flightClass" />
				</td>
		
			<td>
			<span class="inputSpan">* </span>
			<form:input path="flightClass" />
			</td>
		</tr>
		<tr>
			<td><label>Output Preference :</label>
			<form:errors
				path="outputPreference" />
				</td>
		
			<td>
			<span class="inputSpan">* </span>
			<form:input path="outputPreference" />
			</td>
		</tr>
			<div>
			<input type="submit" value="Submit" />
			</div>
		
	</table>
</form:form>
<br>
<br>
<br>
<br>
<c:if test="${not empty lists}">
	<table border="1" cellpadding="15" bgcolor="#FFFFFF" align="center">
		<caption><h2>Avaialable Flights </h2></caption>
		<thead>
			<tr>
				<td>Flight Name</td>
				<td>Destination</td>
				<td>Arrival</td>

				<td>Date</td>
				<td>time</td>
				<td>Duration</td>
				<td>Fare</td>
				<td>Class</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${lists}" var="lists">
				<tr>
					<td>${lists.id}</td>
					<td>${lists.destination}</td>
					<td>${lists.arrival}</td>
					<td>${lists.date}</td>
					<td>${lists.time}</td>
					<td>${lists.duration}</td>
					<td>${lists.fare}</td>
					<td>${lists.flightClass}</td>


				</tr>

			</c:forEach>
		</tbody>
	</table>
</c:if>
</body>
</html>