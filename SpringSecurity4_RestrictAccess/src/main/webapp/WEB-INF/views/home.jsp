<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Restrict Access</title>
	</head>
	
	<body>
		<h1>Welcome Home</h1>
		
		<hr>
		
		<div>
			<span>Name: </span> <span><sec:authentication property="principal.username"/></span>
			<br>
			<span>Role(s)</span> <span><sec:authentication property="principal.authorities"/></span>
		</div>
		
		
		<hr>
		
		<sec:authorize access="hasRole('MANAGER')">
			<a href="${pageContext.request.contextPath }/manager">Click Here to go Manager Page</a>	
		</sec:authorize>
		<br>
		<sec:authorize access="hasRole('ADMIN')">
			<a href="${pageContext.request.contextPath }/admin">Click here to go Admin page</a>	
		</sec:authorize>
	
		<hr>
		
			<form:form action="logout" method="POST">
				<button>Logout</button>
			</form:form>
		
	</body>
</html>