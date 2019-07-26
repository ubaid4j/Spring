<h2>Properties [Applicaton and Spring Boot]</h2>
<ol>
	<h5>These properties will write in application.properties file</h5>
	<li>Context Path: <strong>server.servlet.context-path=/app1</strong></li>
	<li>Port: <strong>server.port=</strong></li>
	<li>JDBC URL: <strong>spring.datasource.url=jdbc:mysql://localhost:3306/database</strong></li>
	<li>JDBC USER NAME: <strong>spring.datasource.username=name</strong></li>
	<li>JDBC Password: <strong>spring.datasource.password=pass</strong></li>
	<li>Name: <strong>spring.security.user.name</strong></li>
	<li>Passowrd: <strong>spring.security.user.password</strong></li>
	<li>Exclue/Indclude Enpoints : <strong> management.endpoints.web.exposure.include= </strong></li>
	<li>We can write any custom property and load using @Value</li>
</ol>