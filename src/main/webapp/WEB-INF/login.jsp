<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
    <div class="container">
 		 <div class="jumbotron">
			  <h1 class="display-4">Let's Hangout</h1>
			  <p class="lead">Inspired by my group of indecisive friends</p>
			  <hr class="my-4">
			  
			  <p> Don't have an account? <a href ="" > Create one here. </a> </p>
			  
			
			<security:authorize access="hasAuthority('INVITEE')">
				<p> INVITEE LOGGED IN </p>
				
			</security:authorize>
			  
			  <form:form action="${pageContext.request.contextPath}/authenticate" method="POST" >
			  
			  <label for="usernameTextbox">Username</label>
			  	<input type="text" class="form-control" name="username" id="usernameTextbox" placeholder="enter username">
			  
			  <label for="usernamePassword">Password</label>
			  	<input type="password" class="form-control" name="password" id="usernamePassword">
			 
			 <br>
			 <button type = "submit" name="login" class="btn btn-primary"> Login </button>
			  
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