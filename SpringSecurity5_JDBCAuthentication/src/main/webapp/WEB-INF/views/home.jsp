<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>

<html>
	<head>
		<title>Home</title>
	</head>
	
	<body>
		<h1>Welcome Again</h1>

		<div>
			<p>User Name: 	<sec:authentication property="principal.username"/></p>
			<p>Roles: <sec:authentication property="principal.authorities"/></p>
		</div>
		
		<div>
			<p><a href="${pageContext.request.contextPath }/manager">Click Here to go Manager Page</a></p>
			<p><a href="${pageContext.request.contextPath }/admin">Click here to go Admin Page</a></p>
			
		</div>
 		<hr>
	
		
	
	
	<!-- the default logout url is /logout -->
	<form:form action="logout" method="POST">
		<button class="btn btn-secondary btn-large" type="submit">
			Logout
		</button>
	</form:form>	

	</body>
	
</html>