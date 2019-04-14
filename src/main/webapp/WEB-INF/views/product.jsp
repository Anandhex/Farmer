<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  

<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Product Details</title>
	<link rel="stylesheet" type="text/css" href="/resources/css/product_desc.css">
	<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<script type='text/javascript' src='http://code.jquery.com/jquery.min.js'></script>
</head>
<body onload="check()">


	<div class="container">
  		<div class="row">
    		<div class="col">
      			<div class="imgBx">
					<img src="${tractorDetails.imageUrl }">
				</div>
    		</div>
    			<div class="col">
      				<div class="details">
				<div class="content">
					<h2><c:out value="${tractorDetails.tractorName}"></c:out><br><span>Heavy Duty Edition</span></h2>
					<p>
						
						<c:out value="${tractorDetails.tractorHp}"></c:out> HP Diesel Engine
						<c:out value="${tractorDetails.tractorCylinder}"></c:out> Cylinder , 1557 CC Engine
						<c:out value="${tractorDetails.tractorTransmission}"></c:out>
						
					Please enter the price and bid on the Tractor.Click on bid button to submit a bit.
					</p>
					<h4><c:out value="${tractorDetails.higherPeriod }"></c:out> peroid</h4>	
					<h3>Base Bid Price: Rs.100</h3>
					<br>
					<br>
					<br>
					<form action="/bid" method="POST">
					<input type="number" id="cbid" name="maxbid"   placeholder="Enter Your Bid Price">
					<br>
					<br>
					<input type="hidden" name="tractorName" value="${tractorDetails.tractorName}">
					<label for="bid">Current Max bid:</label><input  type="number" id="bid" name="bid" value="${maxbid}" readonly="readonly">
					
					<button id="bitButton">Bid Now</button>
					</form>
					<form method="get" action="/downloadPDF">
					
					<button id="generateButton">Generate the result</button>
					</form>
					<div style="margin-top:25px"><a href="/dashboard"><button class="btn btn-outline-primary">Home</button></a></div>
				</div>
				
			</div>
    			</div>
  			</div>
  	</div>

<script type="text/javascript">
function check(){
var d = new Date();
        if (10<d.getHours() && d.getHours()<22) {
        	document.getElementById("bitButton").disabled = false;
        	document.getElementById("generateButton").disabled = true;
        } else {
        	alert("Bidding is Closed");
        	document.getElementById("bitButton").disabled = true;
        	document.getElementById("generateButton").disabled = false;
        }
    }
	

</script>
</body>
</html>