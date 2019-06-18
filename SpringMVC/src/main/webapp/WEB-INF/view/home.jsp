<!DOCTYPE html>
<html>
	<head>
		<title>Spring MVC</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/css/app.css">
		<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/app.js"></script>
	</head>

	
	<body>
		<h1>MVC Spring Home Page</h1>
		<img src="${pageContext.request.contextPath }/resources/images/app_pic.png">
		
		<br>
		<input type="button" onclick="changeColor()" value="Press to change Color">
		
		<br>
		<a href="student/showForm">Show Student Form</a>
		<br>
		<a href="customer/showForm">Show Customer Form</a>
	</body>
	
</html>