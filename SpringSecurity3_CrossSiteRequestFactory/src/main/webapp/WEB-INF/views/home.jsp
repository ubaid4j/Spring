<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>

	<body>
		<h1>Soon, I'll available here</h1>	
	</body>
	
		<!-- the default logout url is /logout -->
	<form:form action="logout" method="POST">
		<button class="btn btn-secondary btn-large" type="submit">
			Logout
		</button>
	</form:form>	
	
	
</html>