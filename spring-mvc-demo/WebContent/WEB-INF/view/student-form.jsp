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
	Lastname: <form:input path="lastName"/>
	
	<input type="submit" value="Submit" /> 
</form:form>

</body>
</html>