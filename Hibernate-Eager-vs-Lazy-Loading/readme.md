<h2 align="center">Eager vs Lazy Loading</h2>
<ol>
	<h3>Eager Loading</h3>
	<li>Load everything at once</li>
	<li>FetchType.Eager on @OneToMany</li>
</ol>
<br><br>
<ol>
	<h3>Lazy Loading</h3>
	<li>Load on demand</li>
	<li>FetchType.Lazy on @OneToMany</li>
</ol>
<br><br>
<h3>Problems on Lazy Fetching</h3>
<p>
	<ol>
		<li>After we close our session, then getting mapped table, will raise exception</li>
		<li>We have two options to resolve this:</li>
		<ol>
			<li>The the respected mapped table before closing the session</li>
			<li>Use <strong>HQL JOIN FETCH</strong> to fetch all items</li>
		</ol>
		The query is: 
		<li>SELECT i FROM INSTRUCT i JOIN FETCH i.courses WHERE i.id = :id</li>
		<li>SELECT allias FROM TYPE allieas JOIN FETCH i.mappedItem WHERE allias.id = :id</li>
	</ol>
</p>