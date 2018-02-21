<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Hangout</title>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.bundle.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/javascript.util/0.12.12/javascript.util.min.js"></script>
	
  <style>
		canvas {
			-moz-user-select: none;
			-webkit-user-select: none;
			-ms-user-select: none;
		}
		
		td:hover {background-color: green; }
		td {background-color: red;}
		.turnGreen {background-color: green; }
		
		.jumbotron {
			background-color: #FFFFFF;
		}
		
		#header {background-color: #03A9F4;
				 color: #FFFFFF;
				}
		
		.titleSubText {
			color: #B3E5FC;
			margin-left: 10px;
		}
  </style>
  
  </head>
  <body>
    <div class="container">
	  	<div class="jumbotron">
	  		<div id="header">
				<h1 class="display-4">Let's Hangout</h1>
				<p class="lead titleSubText">Inspired by my group of indecisive friends</p>
			</div>
			
				<hr class="my-4">
				<h3> ${ hangout.title }</h3>
				<p> ${hangout.description}  </p>
				<hr class="my-4">
			
				
				<div class="row">
					<div class="col-sm-12 col-lg-6">
						
						<p>${poll.title} </p>
						
						<div class="form-check">
						  <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="option1" checked>
						  <label class="form-check-label" for="exampleRadios1">
						     ${poll.get(0).suggestion }
						  </label>
						</div>
						
						<div class="form-check">
						  <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="option2">
						  <label class="form-check-label" for="exampleRadios2">
						    ${poll.get(1).suggestion }
						  </label>
						</div>
						
						<div class="form-check">
						  <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios3" value="option3" >
						  <label class="form-check-label" for="exampleRadios3">
						    ${poll.get(2).suggestion }
						  </label>
						</div>
						<br>					
						<button type="submit" class="btn btn-primary">Vote</button>
						
					</div>
					<br>
					<div class="col-sm-12 col-lg-6">
						<div id="canvas-holder" style="width:100%">
							<canvas id="myChart"></canvas>
						</div>
					</div>
				</div>
	  	
	  	<br/>
	  	<div>
			<table class="table table-bordered">
			  <thead>
			    <tr>
			      <th scope="col"></th>
			      <th scope="col">M</th>
			      <th scope="col">T</th>
			      <th scope="col">W</th>
			      <th scope="col">R</th>
			      <th scope="col">F</th>
			      <th scope="col">S</th>
			      <th scope="col">U</th>
			    </tr>
			  </thead>
			  <tbody>
			    <tr>
			      <th scope="row">8am</th>
			      <td onclick="turnGreen(this)" ></td>
			      <td onclick="turnGreen(this)" ></td>
			      <td onclick="turnGreen(this)" ></td>
			      <td onclick="turnGreen(this)" ></td>
			      <td onclick="turnGreen(this)" ></td>
			      <td onclick="turnGreen(this)" ></td>
			      <td onclick="turnGreen(this)" ></td>
			    </tr>
			    <tr>
			      <th scope="row">9am</th>
			      <td onclick="turnGreen(this)" ></td>
			      <td onclick="turnGreen(this)" ></td>
			      <td onclick="turnGreen(this)" ></td>
			      <td onclick="turnGreen(this)" ></td>
			      <td onclick="turnGreen(this)" ></td>
			      <td onclick="turnGreen(this)" ></td>
			      <td onclick="turnGreen(this)" ></td>
			    </tr>
			    <tr>
			      <th scope="row">10am</th>
			      <td onclick="turnGreen(this)" ></td>
			      <td onclick="turnGreen(this)" ></td>
			      <td onclick="turnGreen(this)" ></td>
			      <td onclick="turnGreen(this)" ></td>
			      <td onclick="turnGreen(this)" ></td>
			      <td onclick="turnGreen(this)" ></td>
			      <td onclick="turnGreen(this)" ></td>
			    </tr>
			  </tbody>
			</table>
	  	</div>
	  </div>
	 </div>
	  

<script>
var data = {
    datasets: [{
        data: ["${poll.get(0).voteCount}", "${poll.get(1).voteCount}", "${poll.get(2).voteCount}"],
	backgroundColor: [   'rgba(255, 99, 132, 0.2)','rgba(54, 162, 235, 0.2)','rgba(255, 206, 86, 0.2)']
	
    
}],

    // These labels appear in the legend and in the tooltips when hovering different arcs
    labels: [
        ' ${poll.get(0).suggestion }',
        ' ${poll.get(1).suggestion }',
        ' ${poll.get(2).suggestion }'
    ]
    };


var ctx = document.getElementById('myChart').getContext('2d');
var chart = new Chart(ctx, {
    // The type of chart we want to create
    type: 'polarArea',

    // The data for our dataset
    data,

    // Configuration options go here
    options: {}
});

function turnGreen(cell){
	cell.className += "turnGreen";
}
</script>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>