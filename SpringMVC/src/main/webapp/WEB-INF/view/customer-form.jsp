<!-- import tag lib -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Customer</title>
		<style type="text/css">
			.error {color:red}
		</style>
	</head>
	
	<body>
		
		Fill out the form. Asterisk(*) means required.
		<br><br>
		
		<!-- simple form having modelAttribute customer -->
		<form:form action="processForm" method="get" modelAttribute="customer">

			<!-- text field which is binded to getFirstName() method -->
			First Name: <form:input path="firstName"/>
			<br><br>
			
			<!-- text field which is binded to getLastName() method  -->
			<!-- there is additional form:errors tag which is also bind to getLastName() method -->
			<!-- when the constraint on getLastName() method becomes false then the given message  -->
			<!-- will be return from getLastName() method -->
			Last Name*: <form:input path="lastName"/> <form:errors path="lastName" class="error"></form:errors>
			
			<!-- text field which is bind to free passes (integer) and will -->
			<!-- show error if input exceeds from the given range -->
			<br><br>
			Free Passes: <form:input path="freePasses"/> <form:errors path="freePasses" class="error"></form:errors>
			
			<!-- this field is bind to postal address -->
			<!-- postal address contain 5 chars/digits -->
			<br><br>
			Postal Address: <form:input path="postalAddress"/> <form:errors path="postalAddress" class="error"></form:errors>
			
			<br><br>
			<input type="submit">
		</form:form>
	</body>
</html>