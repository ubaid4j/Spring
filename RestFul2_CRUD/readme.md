<h1>REST CRUD Application</h1>
<ol>
	<h2>App Configuration</h2>
	<li>See the properties file in the resources and Config file in config package</li>
	<li>Simple create entity, dao and services for documentation see <strong>Spirng/HibernateSpringWebApp</strong></li>
</ol>

<ol>
	<h5>Exception Handling</h5>
	<li>See Spring/RestFul1</li>
</ol>

<h2>Rest API Best Practice</h2>
<img src="api_design_practice.png"/>


<ol>
	<h2>Getting a Customer</h2>
	<li>We Use @GetMapping annotation and @PathVariable annotation in the get Parameter to convert the path variable  to int or any other type</li>
	<li>we set 0 as default id in this method</li>
</ol>


<ol>
	<h2>Adding a Customer</h2>
	<li>We Use @PostMapping annotation and @BodyRequest annotation in the add Parameter to convert the JSON data to POJO</li>
	<li>we set 0 as default id in this method</li>
</ol>

<ol>
	<h2>Updating a Customer</h2>
	<li>We Use @PutMapping annotation and @BodyRequest in the updates's Parameter to convert the JSON data to POJO</li>
	<li>We do not set 0 in this method becuase it is going to update</li>
</ol>

<ol>
	<h2>Delete a Customer</h2>
	<li>We Use @DeleteMapping annotation and @PathVariable annotation in the deletes's Parameter to convert path variable to int or any type</li>
</ol>

<ol>
	<h2>Security </h2>
	<li>For Security see SpringSecurity1 and SpringSecurity5_JDBC Authentication</li>
</ol>



<ol>
	<h5>Notes: </h5>
	<li>Use <strong>@EnableTransactionManagement</strong> to enable HIBERNATE transaction in Config class</li>
	<li>For Spring Security this version 5.1.5.RELEASE use bycript hash starting from $2a as they have only $2a compile pattern for now</li>
</ol>