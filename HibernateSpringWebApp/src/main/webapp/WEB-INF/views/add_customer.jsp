<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Add Customer</title>

		<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/semantic-ui@2.4.2/dist/semantic.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/app.css">
		<script src="https://cdn.jsdelivr.net/npm/semantic-ui@2.4.2/dist/semantic.min.js"></script>

	</head>

	<body>
		<div id="header">
			<div id="content">
				<h2>Add a new Customer</h2>
			</div>
		</div>
		
		<div id="app">
			<form:form action="addNewCustomer" modelAttribute="customer" method="POST">

			<div class="ui five column grid">
				 <div class="row">
    				<div class="one wide column ui label">
    					<label>First Name:</label>
    				</div>
    				<div class="four wide column ui input">
    					<form:input path="firstName"/>
    				</div>
				  </div>
				  
				 <div class="row">
    				<div class="one wide column ui label">
    					<label>Last Name:</label>
    				</div>
    				<div class="four wide column ui input">
    					<form:input path="lastName"/>
    				</div>
				  </div>


				 <div class="row">
    				<div class="one wide column ui label">
    					<label>Email:</label>
    				</div>
    				<div class="four wide column ui input">
    					<form:input path="email"/>
    				</div>
				  </div>

				 <div class="row">
    				<div class="one wide column">
    				</div>
    				<div class="four wide column ui input">
						<input type="submit">
    				</div>
				  </div>

				 				  
			</div>

			</form:form>

		<br>
		<div>
			<a href="list">Return to List</a>
		</div>


		</div>


	</body>
</html>