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