<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!-- We will use JSTL tag library for looping -->
<%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	The student  ${student.firstName } ${student.lastName } is confirmed
	<br><br>
	Country: ${student.country }
	<br><br>
	Favorite Language: ${student.favoriteLanguage}
	<br><br>
	Gender: ${student.gender }
	<br><br>
	Rating: ${student.rating }
	<br><br>
	Operating System(s):
	<ol>
		<c:forEach var="var" items="${student.oses }">
			<li>${var}</li>
		</c:forEach>	
	</ol>
	<br><br>
	Your Favorite Companies:
	<ol>
		<c:forEach var="var" items="${student.companies }">
			<li>${var}</li>
		</c:forEach>
	</ol>
</body>
</html>