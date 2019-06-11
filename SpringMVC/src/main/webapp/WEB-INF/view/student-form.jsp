<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<form:form action="confirm" modelAttribute="student" method="get">
		Student First Name:
		<form:input path="firstName"/>
		<br><br>
		Student Last Name:
		<form:input path="lastName"/>
		<br><br>
		<form:select path="country">
			<form:options items="${student.countries}"></form:options>
		</form:select>
		<br></br>
		<input type="submit">
	</form:form>
</body>
</html>