<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
	<title>PDF</title>

	<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<h2 style="margin-left: 50%;margin-top: 25px;">FarmTract</h2>
	<div class="container" style="margin-top: 25px">
			  <table class="table table-hover">
    <thead>
      <tr>
        <th>Tractor Name</th>
        <th>Farmer Name</th>
        <th>Current Bidding Price</th>
      </tr>
    </thead>
    
    <tbody>
      <c:forEach items="${listbids}" var="bid">
      <tr>
        <td><c:out value="${bid.tractorName}"></c:out></td>
        <td><c:out value="${bid.farmerName}"></c:out></td>
        <td><c:out value="${bid.maxBid}"></c:out></td>
      </tr>
    </c:forEach>
      
    </tbody>
    
  </table>

	</div>
	<div class="row">
	<div class="col-6">
	<button type="button" style="margin-left: 50%" class="btn btn-outline-primary" onclick="myFunction()">Print this page</button>
	</div><div class="col-6">
	
	
	<a href="/dashboard"><button type="button" style="margin-left: 50%"  class="btn btn-outline-primary" >Done</button></a>
	
	</div>
	</div>
<script>
function myFunction() {
  window.print();
}
</script>	
</body>
</html>