<h2 align="center">JDBC Plain Password Authentication</h2>
<ol>
	<li>To build Custom Form Login: See <strong>SpringSecuirty2_CustomLoginForm</strong></li>
	<li>First of all, add dependencies for c3p0 and JDBC</li>
	<li>Check out the required SQL two table structure 1. users and 2. authorities at <strong>resources/structure.sql</strong></li>
	<li>Create database.properties files and give info of JDBC stuff and connection pooling stuff see at <strong>resources/databaseConfig.properties</strong></li>
	<li>In App Config: add @PropertySource annotation for .property file, @Autowired Environment which will automatically hold all *.properties fields</li>
	<li>Now create DataSource Bean: Create <strong>ComboPooledDataSource</strong> and then set all required fields and return it </li>
	<li>After this: In Security Config: in configure method, add Datasource in JDBC authentication </li>
</ol>