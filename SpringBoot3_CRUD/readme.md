<h1>CRUD operations using Spring Boot</h1>

<h3>Here we will user Hibernate, JPA standard and Spring Data</h3>

<ol>
	<h4>Using Hibernate</h4>
	<li>Consturct Spring Boot app</li>
	<li>Remaining all is same, no need of exception handling, most of being handled by Spring Boot</li>
</ol>

<ol>
	<h4>Using JPA</h4>
	<li>session.save --> entityManager.persist</li>
	<li>session.get --> entityManager.find</li>
	<li>session.createQuery --> entityManager.createQuery</li>
	<li>session.saveOrUpdate --> entityManager.merge</li>
	<li>session.delete --> entityManager.remove</li>
	<li>Query --> TypedQuery</li>
</ol>
