<h2>Spring Security with Spring MVC Using Java Config</h2>
<ol>
	<li>First delete web.xml and servlet.xml</li>
	<li>and then, First of all We will create two packages</li>
	<ol>
		<h3>App Configuration</h3>
		<li>Config: with @Configuration, @EnableWebMvc and @ComponentScan and ViewResolver Bean</li>
		<li>Init: extend with AbstractAnnotationConfigDispatcherServletInitializer and override methods</li>
	</ol>	
	<ol>
		<h3>App Security Configuration</h3>
		<li>Config: with @Configuration, @EnableWebSecurity and extend with WebSecurityConfigurerAdapter and override configure method</li>
		<li>Init: extend with AbstractSecurityWebApplicationInitializer and do nothing</li>
		<ol>
			<h5>Notes About Security Cofig</h5>
			<li>Do not call super.configure() in the configure method</li>
		</ol>
	</ol>
</ol>