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
<h3>--------------Data binding with radio buttons------------------</h3>
<ol>
	<li>we use form:radiobutton for one radio button and its attribute are path and value</li>
	<li>we use group radio buttons using one path in the radio buttons </li>
	<li>the second option is to use form:radiobuttons and attribute items to populate it and its path</li>
</ol>
<h3>------------Data binding with check boxes---------------------</h3>
<ol>
	<li>the tag is form:checkbox and attribute is same path but the field referred to java class should be collection (for more information check student-form)</li>
	<li>we have used <strong>JSTL tag library in the student-confirmation.jsp file</strong></li>
	<li>JSTL tag library have several scriptlets to write iteration conditional etc </li>
	<li>we can create the same check boxes using form:checkboxes and populate it using items attributes reffered to any collection, check student-form.jsp and student.java</li>
</ol>
<h3>---------Data Validation using @NotNull(message="mes") @Size(min="", message="") -------------------------------------</h3>
<ol>
	<li>@NotNull annotation is used for a field which is supposed to be validate</li>
	<li>When we used some validating annotation then for this field, we have to make form:errors tag to </li>
	<li>show the message when validation got failed in the view</li>
	<li>In the controller class, we will make a method having two parameters @Valid @ModelAttribute and BindingResult</li>
	<li><strong>For more detail, check, customer-form.jsp, Customer.Java, Customer-Controller.java</strong></li>
</ol>

<h3>--------------------@InitBinder------------------------------------</h3>
<ol>
	<li>@InitBinder annotation is used to pre-process the web request in the controller class</li>
	<li>the method signature is WebDataBinder only</li>
	<li>Here, we created an editor StringTrimmerEditor and register with dataBinder</li>
	<li>to trim the all the string which are being validated</li>
</ol>

<h3>--------------------@Min @Max @NotNull @Pattern--------------------</h3>
<ol>
	<li>See <strong>Customer.Java CostumerController.java and Customer-form.jsp</strong></li>
</ol>

<h3>--------------------Custom Error Messages (messages.properties) --------</h3>
<ol>
	<li>First create a properties file in the resource folder</li>
	<li>Create a special bean in the servlet.xml file</li>
	<li>see <strong>servlet.xml special bean</strong></li>
</ol>


