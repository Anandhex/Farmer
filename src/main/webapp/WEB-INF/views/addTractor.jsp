<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >

<title>Insert title here</title>
</head>
<body>
<div class="container" style="margin-top: 30px">
	<form:form action="/addTractor" method="post" modelAttribute="tractorDetails" >
  <div class="form-group row">
    <form:label path="tractorName" for="tractorName" class="col-sm-2 col-form-label">tractorName</form:label>
    <div class="col-sm-10">
      <form:input path="tractorName" type="text" class="form-control" id="tractorName" name="tractorName" placeholder="Ex: John Doe"/>
    </div>
  </div>
  <div class="form-group row">
    <form:label path="tractorHp" for="tractorHp" class="col-sm-2 col-form-label">tractorHp</form:label>
    <div class="col-sm-10">
      <form:input path="tractorHp" type="number" class="form-control" id="tractorHp" name="tractorHp" placeholder="Ex: John Doe"/>
    </div>
  </div>
  	<div class="form-group row">
    <form:label path="tractorCylinder" for="tractorCylinder" class="col-sm-2 col-form-label">tractorCylinder</form:label>
    <div class="col-sm-10">
      <form:input path="tractorCylinder" type="number" class="form-control" id="tractorCylinder" name="tractorCylinder" placeholder="Ex: John Doe"/>
    </div>
  </div>
  <div class="form-group row">
    <form:label path="tractorTransmission" for="content" class="col-sm-2 col-form-label">tractorTransmission</form:label>
    <div class="col-sm-10">
      <form:input path="tractorTransmission" type="text" class="form-control" id="tractorTransmission" name="tractorTransmission" placeholder="content"/>
    </div>
  </div>
 

  <div class="form-group row">
    <form:label path="tractorTankCapacity" for="tractorTankCapacity" class="col-sm-2 col-form-label">tractorTankCapacity</form:label>
    <div class="col-sm-10">
      <form:input path="tractorTankCapacity" type="text" class="form-control" id="tractorTankCapacity" name="tractorTankCapacity" placeholder="author"/>
    </div>
  </div>
  <div class="form-group row">
    <form:label path="tractorAge" for="tractorAge" class="col-sm-2 col-form-label">tractorAge</form:label>
    <div class="col-sm-10">
      <form:input path="tractorAge" type="text" class="form-control" id="tractorAge" name="tractorAge" placeholder="author"/>
    </div>
  </div>
  <div class="form-group row">
    <form:label path="imageUrl" for="imageUrl" class="col-sm-2 col-form-label">imageUrl</form:label>
    <div class="col-sm-10">
      <form:input path="imageUrl" type="text" class="form-control" id="imageUrl" name="imageUrl" placeholder="author"/>
    </div>
  </div>
   <div class="form-group row">
    <form:label path="higherPeriod" for="higherPeriod" class="col-sm-2 col-form-label">higherPeriod</form:label>
    <div class="col-sm-10">
      <form:input path="higherPeriod" type="text" class="form-control" id="higherPeriod" name="higherPeriod" placeholder="higherPeriod"/>
    </div>
  </div>
 
  <div class="form-group row">
    <div class="col-sm-10">
      <button style="margin: 0 50% 0 50%" type="submit" class="btn btn-primary">Regsiter</button>
    </div>
  </div>
</form:form>

  </div>
	
</body>
</html>