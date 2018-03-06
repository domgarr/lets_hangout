<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!--  
How to reference a CSS stylesheet. 
<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

 -->

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

	<script src="https://unpkg.com/react@16/umd/react.development.js"></script>
    <script src="https://unpkg.com/react-dom@16/umd/react-dom.development.js"></script>
    <script src="https://unpkg.com/babel-standalone@6.15.0/babel.min.js"></script>


    <title>Hello, world!</title>
  </head>
  <body>
    <div class="container">
 		 <div class="jumbotron">
			  <h1 class="display-4">Let's Hangout</h1>
			  <p class="lead">Inspired by my group of indecisive friends</p>
			  <hr class="my-4">
			  <p>Lets fix that!</p>
			  <p>
			  Start by creating a poll, add some suggestions, and let the group vote on what to do!
			  </p>
			  <p class="lead">
			    <a class="btn btn-primary btn-lg" href="showForm" role="button">Create a poll</a>
			  </p>
			  
			  <security:authentication property="principal.username" />
			  <security:authentication property="principal.authorities" />
			
			<div class="row">
				<c:forEach var="hangout" items="${hangouts}">
				
				<!-- construct an "update" link with customer id -->
					<c:url var="viewHangoutLink" value="/hangout/showHangout">
						<c:param name="hangoutId" value="${hangout.id}" />
					</c:url>
				
					<div class = "col-lg-4">
						<div class="card" style="width: 18rem;">
						  <div class="card-body">
						    <h5 class="card-title">${hangout.title}</h5>
						    <p class="card-text"> ${hangout.description}</p>
						    <a href="${viewHangoutLink}" class="card-link">View</a>
						    <a href="#" class="card-link">Edit</a>
						  </div>
						</div>
					</div>
				</c:forEach>
				
				
			</div>
			
				<form:form action="${pageContext.request.contextPath}/logout" method="POST">
					<input type="submit" value="Logout" >
				</form:form>
		 </div>
	</div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  	
  	
  
  </body>
</html>