<h2 align="center">Database Web Application Using Hibernate and Spring MVC</h2>
<h3 align="center">XML based Version</h3>

<ol>
	<h3>Configuraiton</h3>
	<li>We have two starter files at WEB-INF/servlet-cnf.xml adn WEB-INF/web.xml</li>
	<li>Dependencies can be checked from pom.xml</li>
</ol>

<ol>
	<h3>CustomerController + Customer + CustomerDAO + customer-list.jsp</h3>
	<ol>
		<li>Create a Customer DAO:  Use here
			<ol>
				<li>@Repository: subclass of @Component</li>
				<li>@Transactional: it create and end transaction automatically</li>
				<li>@GetMapping and @PostMapping</li>
			</ol>
		</li>
	</ol>
	<h3>customer-list.jsp -> Controller -> Service ->  DAO</h3>
	<ol>
		<li>Service Layer Added
			<ol>
				<li>@Service: subclass of @Component, tells spring to scan as a service [Facade Design]</li>
				<li>@Transactional: Move it from DAO to Service</li>
			</ol>
		</li>
		<li>Save to Database Added
			<ol>
				<li>Create method in DAO to save in the database</li>
				<li>Same method in the Service</li>
				<li>@PostMapping to save the customer</li>
				<li>And then return redirect <strong>"redirect:path"</strong></li>				
			</ol>
		</li>
		<li><h3>Update Customer</h3>
			<ol>
				<li>In JSP file, create a update link and store varaible from: <strong>c:url -> c:param</strong></li>
				<li>The get method will retrieve the customer from given id and then </li>
				<li>add this customer into the same add customer form</li>
				<li>in add form, we will add <strong>form:hidden path="id"</strong> which tells: </li>
				<li>if id field is empty then insert if id is available then update customer</li>
				<li>the action remain same for update</li>
				<li>only change in DAO, change .save to .saveOrUpdate</li>
			<ol>
		</li>
	</ol>
	
</ol>