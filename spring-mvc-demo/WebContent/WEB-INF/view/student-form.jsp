<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter student details</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">
	Firstname (*): <form:input path="firstName"/>
	<form:errors path="firstName" cssClass="error" />
	<br><br>
	Lastname (*): <form:input path="lastName"/>
	<form:errors path="lastName" cssClass="error" />
	<br><br>
	Country: 
	<form:select path="country">
		<!-- <form:option value="Brazil">Brazil</form:option>
		<form:option value="France">France</form:option>
		<form:option value="India">India</form:option> -->
		<form:options items="${student.countryOptions}" />
	</form:select>
	
	<br><br>
	Favorite Language:
	<br> 
	<!-- 
	 Java: <form:radiobutton path="favoriteLanguage" value="Java"/>
	PHP: <form:radiobutton path="favoriteLanguage" value="PHP"/>
	C#: <form:radiobutton path="favoriteLanguage" value="C#"/>
	Ruby: <form:radiobutton path="favoriteLanguage" value="Ruby"/>
	-->
	<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"/>
	<br><br>
	Which OS you are familiar with:
	<form:checkboxes items="${student.favoriteOSOptions}" path="favoriteOS"/>
	<input type="submit" value="Submit" /> 
</form:form>

</body>
</html>