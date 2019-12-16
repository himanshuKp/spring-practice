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
	Firstname: <form:input path="firstName"/>
	<br><br>
	Lastname: <form:input path="lastName"/>
	<br><br>
	Country: 
	<form:select path="country">
		<!-- <form:option value="Brazil">Brazil</form:option>
		<form:option value="France">France</form:option>
		<form:option value="India">India</form:option> -->
		<form:options items="${student.countryOptions}" />
	</form:select>
	
	<input type="submit" value="Submit" /> 
</form:form>

</body>
</html>