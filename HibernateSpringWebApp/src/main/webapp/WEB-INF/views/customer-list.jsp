<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Customer Lists</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/css/app.css">
	</head>
	
	<body>
		<div id="wrapper">
			<div id="header">
				<h2>Customer Management App</h2>
			</div>
		</div>
		
		<div id="container">
			<div id="table_content">
				<table>
					<thead>
						<tr>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Email Address</th>							
						</tr>
					</thead>
					<tbody>
						<c:forEach var="customer" items="${customers }">
							<tr>
								<td>${customer.firstName }</td>
								<td>${customer.lastName }</td>
								<td>${customer.email }</td>
							</tr>
						</c:forEach>									
					</tbody>
				</table>
			</div>
		</div>
	</body>


</html>