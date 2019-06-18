<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<title>
			Confirmation
		</title>
	</head>
	
	<body>
		Customer ${customer.firstName } ${customer.lastName } is confirmed
		<br><br>
		Free Passes: ${customer.freePasses }
		<br><br>
		Postal Address: ${customer.postalAddress }
	</body>
</html>