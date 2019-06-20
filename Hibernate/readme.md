<h2 align="center">Its aboutt Hibernate</h2>
<ol>
	<li>Check out starter file which is in src root directory</li>
</o>

<h3 align="center">Mapping Objects</h3>
<ol>
	see <strong>com.ubaid.hibernate.entity.Student</strong>
	<li><strong>@Entity</strong> tell hibernate to scan this and <strong>@Table</strong> map table</li>
	<li><strong>@column</strong> map field to table column</li>
	<li><strong>@Id</strong> for key and <strong>@GeneratedValue</strong> is for strategy </li>
</ol>


<h3 align="center">Adding object</h3>
<ol>
	see <strong>com.ubaid.hibernate.addingDemo.Demo.java</strong>
	<li>First create SessionFactory</li>
	<li>Then create session</li>
	<li>create transaction</li>
	<li>create object</li>
	<li>save object in the session</li>
	<li>commit the transaction</li>
	<li>close the transaction</li>
</ol>


<h3 align="center">Reading object</h3>
<ol>
	see <strong>com.ubaid.hibernate.ReadingDemo.ReadingDemo.java</strong>
	<li>use session.get(T, Serializeable) to read object from the database</li>	
</ol>


<h3 align="center">Querying object</h3>
<ol>
	see <strong>com.ubaid.hibernate.queryObject.QueryObjectDemo.java</strong>
	<li>use session.createQuery(query, type).getResultList to get list of type</li>	
</ol>


<h3 align="center">Updating Objects</h3>
<ol>
	see <strong>com.ubaid.hibernate.UpdateObject.Demo.java</strong>
	<li>get persistent instance using session.get(T, id) method and set value</li>
	<li>or</li>
	<li>create query and execute update</li>	
</ol>

<h3 align="center">Deleting Objects</h3>
<ol>
	see <strong>com.ubaid.hibernate.deleteObject.Demo.java</strong>
	<li>get persistent instance using session.get(T, id) method and delete using session.set(object)</li>
	<li>or</li>
	<li>create query and execute update</li>	
</ol>

