<h1>Very First Spring Boot App</h1>
<ol>
	<li>Create App from Spring Initializer</li>
	<li>And Create Rest Controller for "/" mapping</li>
	<li>The packaging is jar so run this app as Java Application</li>
</ol>

<ol>
	<h3>Spring Boot Dev Tools</h3>
	<li>These are required to automatically load application on changing in code</li>
</ol>

<ol>
	<h3>Spring Boot Actuator</h3>
	<li>Spring Boot actuator gives more than 15 free end points for different stuff</li>
	<li>They are prefixed with /actuator</li>
	<li>For example: /actuator/info gives the info of this app</li>
	<li>We can include or exclude the end points using <strong>management.endpoints.web.exposure.include or .exclude= , , </strong></li>
	<li>We can give info of app in .properties file using info.app.*</li>
</ol>

<ol>
	<h3>Spring Boot Actuator Security</h3>
	<li>For Actuator End point security simply add boot-starter-security dependency</li>
	<li>It will ask for user name and password when we go other than info/health end point</li>
</ol>


<ol>
	<h3>Note: </h3>
	<li>Conversion to WAR Project for Deployment</li>
	<li>Simply include <packaging>war</packaging></li>
	<li>Now, add spring-boot-starter-tomcat dependecny</li>
	<li>Extend the App class with  SpringBootServletInitializer</li>
	<li>Override configure(SpringApplicationBuilder) method</li>
	<li>and return application.sources(App.class)</li>
</ol>
<ol>
	<h3>Note: </h3>
	<li>Converting WAR Project to JAR</li>
	<li>Remove WAR Packaging</li>
	<li>Remove spring-boot-starter-tomcat dependecny</li>
	<li>Remove extension and revert to SpringApplication.run(Class, args)</li>
	<li>Remove arguments about WEB and nature about js in .project file</li>
	<li>Remove .xml file in .settings</li>
</ol>


