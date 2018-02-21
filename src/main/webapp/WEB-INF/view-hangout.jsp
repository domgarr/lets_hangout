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
  </style>
  
  </head>
  <body>
    <div class="container">
	  	<div class="jumbotron">
	  		<div id="header">
				<h1 class="display-4">Let's Hangout</h1>
				<p class="lead">Inspired by my group of indecisive friends</p>
				<hr class="my-4">
				<h3> Let's eat out? </h3>
				<p>Hey everyone. I'm free tonight, you guys want to go eat out somewhere?</p>
				<hr class="my-4">
				
				<div class="row">
					<div class="col-sm-12 col-lg-6">
						
						<p> Where do you guys wanna eat? </p>
						
						<div class="form-check">
						  <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="option1" checked>
						  <label class="form-check-label" for="exampleRadios1">
						    Caboto Pizza
						  </label>
						</div>
						
						<div class="form-check">
						  <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="option2">
						  <label class="form-check-label" for="exampleRadios2">
						    Dragons Inn
						  </label>
						</div>
						
						<div class="form-check">
						  <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios3" value="option3" >
						  <label class="form-check-label" for="exampleRadios3">
						    California Sushi
						  </label>
						</div>
						
						<div class="form-check">
						  <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios3" value="option3" >
						  <label class="form-check-label" for="exampleRadios3">
						    Pho-Xic-Lo
						  </label>
						</div>
						
						<button type="submit" class="btn btn-primary">Vote</button>
						
					</div>
					
					<div class="col-sm-12 col-lg-6">
						<div id="canvas-holder" style="width:100%">
							<canvas id="myChart"></canvas>
						</div>
					</div>
				</div>	
	  		</div>
	  	</div>
	  	
	  	<script>
var data = {
    datasets: [{
        data: [3, 2, 1,1],
	backgroundColor: [   'rgba(255, 99, 132, 0.2)','rgba(54, 162, 235, 0.2)','rgba(255, 206, 86, 0.2)', 'rgba(54, 255, 86, 0.2)']
	
    
}],

    // These labels appear in the legend and in the tooltips when hovering different arcs
    labels: [
        'Caboto Pizza',
        'Dragons Inn',
        'California Sushi',
        'Pho-Xic-Lo'
    ],
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



</script>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>