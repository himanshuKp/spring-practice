<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student confirmation page</title>
</head>
<body>

<h2>Student details are as: </h2>

<h4>Firstname: ${student.firstName}</h4>
<br>
<h4>Lastname: ${student.lastName}</h4>
<br>
Country: ${student.country}
<br>
Favorite Language: ${student.favoriteLanguage}
<br>
Favorite OS: ${student.favoriteOS}
<br>
Course code: ${student.courseCode}
<br>
Postal Code: ${student.postalCode}
</body>
</html>