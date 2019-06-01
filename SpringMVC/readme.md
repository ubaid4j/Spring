<ol>
	<li>There are two dependencies other than spring framework dependencies</li>
	<ol>
		<li>jstl-api</li>
		<li>javax.servlet.jsp.jstl-api</li>
	</ol>
	<li>First create a project using MVN (architype web app) or Dynamic Web App from eclipse</li>
	<li>Then change web.xml file <strong> which is in webapp/WEB-INF/ directory</strong></li>
	<ol>
		<li>configure spring MVC dispatcher servlet and give it context directory</li>
		<li>and map it <strong>initially for all request which is '\'</strong></li>
	</ol>
	<li>Now we will create spring-mvc-servlet.xml file which actually tells the context of spring</li>
	<li>There are three steps in this .xml file</li>
	<ol>
		<li>Add component scan </li>
		<li>Add annotation driven</li>
		<li>Define Define Spring MVC view resolver</li>
	</ol>
</ol>