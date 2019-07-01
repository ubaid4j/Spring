<h2>@AfterReturning ~ @AfterThrowing ~ @After</h2>
<ol>
	<h3>@AfterReturing</h3>
	<li>The format: @AfterReturing(pointcut="", returning="")</li>
	<li>The method signature for this annotation is: (JointPoint, Object) then name of object should be same as returning name</li>
</ol>
<ol>
	<h3>@AfterThrowing</h3>
	<li>The format: @AfterReturing(pointcut="", throwing="")</li>
	<li>The method signature for this annotation is: (JointPoint, Throwable) then name of Throwable should be same as throwing name</li>
</ol>
<ol>
	<h3>@After</h3>
	<li>The format: @AfterReturing("exp")</li>
	<li>The method signature for this annotation is: (JointPoint)</li>
</ol>