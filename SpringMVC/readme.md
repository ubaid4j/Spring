---------------------------------------------The starter configuration-----------------------------------------------------------------
<ol>
	<li>There are two dependencies other than spring framework dependencies</li>
	<ol>
		<li>jstl-api</li>
		<li>javax.servlet.jsp.jstl-api</li>
	</ol>
	<li>First create a project using MVN (architype web app) or Dynamic Web App from eclipse</li>
	<li>Then change web.xml file <strong> which is in webapp/WEB-INF/ directory</strong></li>
	<ol>
		<li>configure spring MVC dispatcher servlet and give it context directory</li>
		<li>and map it <strong>initially for all request which is '\'</strong></li>
	</ol>
	<li>Now we will create spring-mvc-servlet.xml file which actually tells the context of spring</li>
	<li>There are three steps in this .xml file</li>
	<ol>
		<li>Add component scan </li>
		<li>Add annotation driven</li>
		<li>Define Define Spring MVC view resolver</li>
	</ol>
</ol>
----------------------------------------------------------------------------


<h3>----Controller-----</h3>
<ol>
	<li>So, we will create controller class, <strong>In controller, the annotations are:</strong></li>
	<ol>
		<li><strong>@Controller</strong> which is sub class of @Component and will convert to bean after scanning</li>
		<li><strong>@RequestMapping</strong> which get the url as the argument in the annoations and its methhod return the name of view component </li>
	</ol>
	<li>The inputs in the form will go automatically goes in another page using ${param.inputName}</li>
</ol>

<h3>--------Model-------------</h3>
<ol>
	<li>To add data in model we will have method annotate with <strong>@RequestMapping</strong> and having signature (HttpServletRequest and Model) and it will return the string refer to the view file</li>
</ol>


<h3>-------Resource Mapping------</h3>
<h5>-------CSS, JS and Images------</h5>
<ol>
	<li><strong>mvc:resources mapping="/resources/**" location="/resources/"</strong>  add this in servlet.xml file</li>
	<li>and</li>
	<li>this will be our base path <strong>${pageContext.request.contextPath }/resources/</strong> which we can add in <strong>href</strong> or <strong>src</strong> </li>
</ol>

<h3>--------------------------RequestParam----------------------</h3>
<ol>
	<li>RequestParam is annotation which is inside the method arguments</li>
	<li>It automatically bind the input from the form to the parameter in the method</li>
</ol>

<h3>------------------------Relative Mapping--------------------</h3>
<ol>
	<li>So, we can annotate a controller class with @RequestMapping and then its methods with the same annotations</li>
	<ol><strong>Example</strong>
		<li>Let we have class annotate with @RequestMapping("hello") and </li>
		<li>its one of method with @RequestMappings("showForm") then </li>
		<li>the path for showForm will be <strong>/hello/showForm/</strong></li>
	</ol>
</ol>

<h3>-----------------------ModelAttribute-----------------------</h3>
<ol>
	<li>
		modelAttribute is used as attribute in the form:form tag 
	</li>
	<li>
		and it used as annotation as an argument in the under the @RequestMapping annotation 
	</li>
	<li>
		to bind an java object from a view from to model 
	</li>
	<ol>
		Procedure:
		<li>We will bind form with an object which we created as POJO. <strong>see the student-form.jsp</strong></li>
		<li>we will get this object using @ModelAttribute("name_of_object") annotation</li>
		<li>the argument in the @ModelAttribute annotation and the name of modelAttribute attribute must be same</li>
	</ol>	
</ol>
<h3>----------------Data binding with drop down-------------------</h3>
<ol>
	<li>
		we use from:select and inner form:option and assign the path of form:select as before
	</li>
	<li>
		to populate data from java classes then we use form:options and attribute items 
	</li>
	<li>
		see student-form.jsp for reference 
	</li>
</ol>

