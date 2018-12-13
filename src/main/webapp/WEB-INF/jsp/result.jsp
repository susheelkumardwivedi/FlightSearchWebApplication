<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Results</title>
</head>

<body>
	<h1>Search Results</h1>
</body>

<c:if test="${not empty lists}">
	<table border="1" cellpadding="15">
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