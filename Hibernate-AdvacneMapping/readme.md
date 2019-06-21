<h2 align="center">Hibernate Advacne Mapping</h2>

<p><strong>Info:</strong>In this project: we will use advance mapping of Hibernate there are three types of Mapping: <ol><li><strong>One to One</strong></li><li><strong>One to Many</strong></li><li><strong>Many to Many</strong></li></ol>We will control cascading type in source code. For One to One We will set all cascading true</p>

<ol>
	<strong>One to One Mapping UniDirectional: com.ubaid.hibernate.oneTooneMappingUni</strong>
	<li>For this mapping we use: 
		<ol>
			<li><strong>@JoinColumn</strong>: the column which act as a foreign key</li>
			<li><strong>@OneToOne(strategy)</strong>: we mention cascade strategies on the same field</li>
		</ol>
	</li>
	<strong>One to One Mapping BiDirectional: com.ubaid.hibernate.oneTooneMappingBi</strong>
	<li>To make BiDirectional we make: 
		<ol>
			<li><strong>@JoinColumn</strong> and <strong>@OneToOne(strategy)</strong> will remain same</li>
			<li>Then in the mapped entity <i>in this case InstructorDetail</i> we create an instance of Instructor and annotate it <strong>@OneToOne(mappedBy="the name of field which is annotated by @JoinColumn, strategy)</strong></li>
			<li>When we delete the object of Instructor detail, then it will delete Instructor too</li>
			<li>To delete only Instructor detail, we will change the cascade type of join column field in @OneToOne annotation</li>
		</ol>
	</li>

	
</ol>