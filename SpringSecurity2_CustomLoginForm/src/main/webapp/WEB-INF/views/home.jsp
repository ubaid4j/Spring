<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
	<head>
		<title>Home</title>
	</head>
	
	<body>
		<h1>Welcome Again</h1>
	</body>
	
	<!-- the default logout url is /logout -->
	<form:form action="logout" method="POST">
		<button class="btn btn-secondary btn-large" type="submit">
			Logout
		</button>
	</form:form>	
	
</html>