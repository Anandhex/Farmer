<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    

<!DOCTYPE HTML>

<html>
	<head>
		<title>Welcome</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="/resources/css/home/main.css" />
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
		<style type="text/css" scoped>
.GeneratedMarquee {
font-family:'Arial Black', sans-serif;
font-size:2em;
line-height:1.3em;
color:#66FF00;
padding:1.5em;

}
</style>
	</head>
	<body class="landing">

		<!-- Header -->
			<header id="header" class="alt">
				<h1><strong><a href="/dashboard"></a></strong></h1>
				<nav id="nav">
					<ul>
						<li><a href="/dashboard">Home</a></li>
						<li><a href="/dashboard">MyProfile</a></li>
						<li><a href="#">${farmerData.farmerName }</a></li>
						<li><a href="/logout">LogOut</a></li>
					</ul>
				</nav>
			</header>

			<a href="#menu" class="navPanelToggle"><span class="fa fa-bars"></span></a>

		<!-- Banner -->
			<section id="banner">
				<style>
* {
  box-sizing: border-box;
}

body {
  background-color: #D9D9D9;
  font-family: Arial, Helvetica, sans-serif;
}

/* Float four columns side by side */
.column {
  float: left;
  width: 25%;
  padding: 0 10px;
}

/* Remove extra left and right margins, due to padding */
.row {margin: 0 -5px;}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Responsive columns */
@media screen and (max-width: 600px) {
  .column {
    width: 100%;
    display: block;
    margin-bottom: 20px;
  }
}

/* Style the counter cards */
.card {
  margin-top: 30px;
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  padding: 50px;
  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
  transition: 0.3s;
  text-align: center;
  background-color: #fff;
  border-radius: 10px;
  height: 380px;
}

.card:hover {
  box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
}

.card button{
  border: none;
  outline: 0;
  padding: 3px;
  color: white;
  border-radius: 20px;
  background-color: #8CC35E;
  text-align: center;
  cursor: pointer;
  width: 100%;
  font-size: 18px;
}
</style>
</head>
<body>
<div class="row">
<c:set var="count" value="0" scope="page"></c:set>	
<c:forEach items="${tractors}" var="tractor">

  <div class="col-3">
 <form action="/bid" method="get">
    <div class="card">
      <img src="${tractor.imageUrl }" alt="tracto1" style="width:250px">
      <p>${tractor.tractorName }</p>
      <p><button>More Info...</button></p> 
      <input type="hidden" name="tractorName" value="${tractor.tractorName}">
      
    </div>
    <c:set var="count" value="${count+1}" scope="page"></c:set>
  </div>
  </form>
<c:if test="${count}%3==0">
		</div>
		<div class="row">
	</c:if>
	
</c:forEach>
          
        <marquee class="GeneratedMarquee" direction="left" scrollamount="8" behavior="scroll"><c:out value="${bidding}"></c:out></marquee>

				<ul class="actions">
				
				</ul>
			</section>

			<!-- One -->
				<section id="one" class="wrapper style1">




				</section>

			<!-- Two -->
				
		<!-- Footer -->
		
	</body>
</html>