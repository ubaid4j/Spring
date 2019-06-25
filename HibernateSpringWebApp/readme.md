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
	</ol>
	
</ol>