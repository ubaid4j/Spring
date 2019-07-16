<h1 align="center">Creating Custom Form using Spring Security</h1>
<ol>
	<h3>Initial Configuration</h3>
	<li>Check the repository <strong>Spring/SpringSecurity1</strong> readme.md for initial config</li>
	<ol>
		Changes
		<li>Implement the App Config with WebMvc and override addResourceHandlers and add add Resource handler and add Resource Location in the registry. The addResource Handler is the URL pattern e.g. /resources/**</li>
		<li>Then in the Security Config Override Confgure(HTTP) method and then first permit all /resources/** pattern</li>
	</ol>
	<li>Structure will be src/main/webapp/WEB-INF and src/main/webapp/resources</li>
	<li>For displaying error use c:if test=""</li>
</ol>