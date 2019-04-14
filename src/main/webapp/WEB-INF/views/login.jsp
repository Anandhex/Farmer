<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
    <title> Login Form  </title>
    <link rel="stylesheet" type="text/css" href="/resources/css/login_style.css">  

</head>
    <body>
    <div class="login-box">
    <img src="/resources/images/login/avatar.png" class="avatar">
        <h1>Login Here</h1>
            <form method="post" action="/login">
            <p>Aadhaar No</p>
            <input type="text" name="aadhaar_no" placeholder="Enter Aadhaar No.">
            <p>Name</p>
            <input type="text" name="name" placeholder="Enter Name">
            <p>DOB</p>
              <input type="date" name="dob">

            <input type="submit" name="submit" value="Login">
               
            </form>
        <p align="center"><c:if test="${errorMessage ne null}">
		<strong style="color: red;"><c:out
				value="${errorMessage}"></c:out></strong>
	</c:if>
        
        </div>
    
    </body>
</html>
