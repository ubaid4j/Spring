<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<!-- so we have form:form tag which is spring mvc tag imported from taglib 
	it do the same work as html form tag but it has cabability to bind data with java classes 
	directly -->
	
	<!-- modelAttribute refer the class which is added in the model in 
	@RequestMapping annotated method -->
	<form:form action="confirm" modelAttribute="student" method="get">
		
		<!-- 
			all path refer to the getters/setters of the modelAttribute class, in this case it is 
			student class
		 -->
		
		<!-- form:input is same as html input, path will refer to the getFirstName() method 
		in the Student class -->
		Student First Name:
		<form:input path="firstName"/>
		<br><br>
		Student Last Name:
		<form:input path="lastName"/>
		<br><br>
		
		
		<!-- form:select is same as html select tag, and path refer to getCountry method in the
		Student class -->
		<form:select path="country">
		
			<!-- 
					we can use two type of stuff
						1. form:option and mention its value and label 
							or
						2. form:options and mention its items where items will be collection map or array
			
			 -->
		
			<form:options items="${student.countries}"></form:options>
		</form:select>
		<br></br>
		
		<!-- form:radiobutton play the same role as html radio button
		path will bind the data with java class 
		for groups of radio button the path should be same   -->
		Favorite Language :
		<form:radiobutton path="favoriteLanguage" value="Java"/> Java
		<form:radiobutton path="favoriteLanguage" value="C#"/> C#
		<form:radiobutton path="favoriteLanguage" value="PHP"/> PHP
		<form:radiobutton path="favoriteLanguage" value="C++"/> C++
		
		
		<br><br>
		Gender:
		<form:radiobutton path="gender" value="Male"/> Male
		<form:radiobutton path="gender" value="Female"/> Female
		
		<!-- 
			form:radiobuttons is the extended form of form:radiobutton 
			it has path which bind the data and it has another attribute which is 
			items which populate the items 
			
		 -->
		<br><br>
		Ratings: 
		<form:radiobuttons path="rating" items="${student.ratings }" />
		
		
		<!-- check boxes all things are same -->
		<br><br>
		Select your Operating System(s)
		<form:checkbox path="oses" value="MS Windows"/> MS Windows
		<form:checkbox path="oses" value="Chrome OS"/> Chrome OS
		<form:checkbox path="oses" value="Android OS"/> Android OS
		
		
		<br><br>
		Select your favorite Laptop Vendor Companies
		<form:checkboxes items="${student.companiesName}" path="companies"/>
		
		<!-- 
			at last simple submit type input to submit this into the action path
		 -->
		<br><br>
		<input type="submit">
	</form:form>
</body>
</html>