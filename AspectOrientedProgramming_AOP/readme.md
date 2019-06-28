<h2 align="center">Aspect Oriented Programming</h2>
<ol>
	<li>Usage of: </li>
	<ol>
		<li><strong>@Before: </strong> annotate method and set <strong>execution("method signature")</strong> parameter</li>
		<li><strong>@Aspect: </strong> annotate class</li>
		<li><strong>@EnableAspectJAutoProxy: </strong>enable aop proxy in the config java file</li>
	</ol>
	<li>PointCut Expression</li>
	<ol>
		<strong>The format of pin point expression is: </strong>
		<li>modifier? returnType fullClassName? methodName(parameters) exception?</li>
	</ol>
	<li>Matching Parameters</li>
	<ol>So we have:
		<li>( * ) for one parameter of any type and name</li>
		<li>( . . ) for any number of parameters of any type and name</li>
		<li>and for specific parameters we will give <strong>fully qualified name</strong> of this parameter</li>
	</ol>
	<li>Matching Packages</li>
	<ol>
		<li><strong>* package.path.*.*(*)</strong> this pattern will used to include all methods in the specific package</li>
	</ol>
	<li>
		<h3>For clarification see: <strong>com.ubaid.app.aop.logging.LoggingAspect.java</strong></h3>
	</li>
</ol>