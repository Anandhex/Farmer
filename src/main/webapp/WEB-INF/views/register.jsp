<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Sign Up</title>
  
    <link rel="stylesheet" href="/resources/css/reg_style.css">
  </head>
  <body>
<form:form method="post" action="/register" modelAttribute="farmerData">
<div class="login-box">
  <h1>Register</h1>

  <div class="textbox">
    <i class="fas fa-user"></i>
    <form:input path="farmerName" type="text" placeholder="Full Name" name="farmerName" />
  </div>

  <div class="textbox">
    <i class="fas fa-lock"></i>
    <form:input path="farmerAadhar" type="textbox" placeholder="Aadhar No" name="farmerAadhar"/>
  </div>

  <div class="textbox">
    <i class="far fa-calendar-alt"></i>
    <form:input path="farmerDOB" type="date" placeholder="DOB" name="farmerDOB"/>
  </div>

  <div class="textbox">
    <i class="fas fa-phone"></i>
    <form:input path="farmerPhno" type="textbox" placeholder="Phone No" name="farmerPhno"/>
  </div>

  <div class="textbox">
    <i class="fas fa-map-marked-alt"></i>
    <form:input path="farmerDistrict" type="textbox" placeholder="District" name="farmerDistrict"/>
  </div>
<div class="textbox">
    <i class="fas fa-home"></i>
    <form:input path="farmerTaluk" type="textbox" placeholder="Taluk" name="farmerTaluk"/>
  </div>
  <div class="textbox">
    <i class="fas fa-home"></i>
    <form:input path="farmerVillage" type="textbox" placeholder="Home Town" name="farmerVillage"/>
  </div>

  <input type="submit" class="btn" value="Sign in">
</div>
</form:form>
  </body>
</html>
