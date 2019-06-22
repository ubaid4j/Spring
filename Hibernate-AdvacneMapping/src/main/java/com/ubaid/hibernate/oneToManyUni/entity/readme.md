<h2 align="center">Important Information</h2>
<p>
	We have 4 tables:
	<ol>
		<li>Instructor</li>
		<li>InstructorDetail</li>
		<li>Course</li>
		<li>Review</li>
	</ol>
	Instructor and InstructorDetail are one to one unidirectional mapped
	<br><br>
	Instructor and Course are one to many bidirectional mapped [cascade no delete]
	<br><br>
	Course and Review are one to many unidirectional mapped 
	<br>
	When Review is deleted then it will not effect on the course 
	but when course is deleted then all reviews automatically deleted
	<br>
</p>

<h3 align="center">Difference between One to Many UniDirectional and BiDirectional</h3>
<p>
	In BiDirectional, instance of first table is presented in the second table
	<br>
	While  in unidirectional, instance of first table is not presented stead, we use @JoinColumn in the collection and name it, its actual name of column
	<br>
	See Course.java
</p>