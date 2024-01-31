<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<br>

<h1>Welcome To School Online</h1>
<br>
<a href="ContactUs.jsp">Contact Us</a>
<br>

<form action="userLogin">
User ID <input type="text" name ="userID"><br>
Password <input type="password" name ="pass"><br>
<input type="radio" id="student" name="selector" value="student">
<label for="student">Student</label><br>
<input type="radio" id="teacher" name="selector" value="teacher">
<label for="teacher">Teacher</label><br>
<input type ="submit" value ="Login">
</form>
<br>
<form action="adminLogin">
Login as Admin
<input type ="submit" value ="Login">
</form>
</body>
</html>