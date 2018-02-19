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
	  		<div id="header">
				<h1 class="display-4">Let's Hangout</h1>
				<p class="lead">Inspired by my group of indecisive friends</p>
				<hr class="my-4">
				<h3 class="display-4">Create a new Hangout</h3>
				<hr class="my-4">
	  		</div>
	  	
			 <div id="content">
				  <form>
					  <div class="form-group">
					    <label for="hangoutTitle">Enter a title</label>
					    <input type="text" class="form-control" id="hangoutTitle" aria-describedby="emailHelp" placeholder="Enter title">
					  </div>
					  <div class="form-group">
					    <label for="hangoutDescription">Description of the hangout</label>
					    <textarea class="form-control" id="hangoutDescription" placeholder="Im free tonight, wanan let's play something." rows = "3"> </textarea>
					  </div>
					  <p> Suggest some activities </p>
					  <div class="form-group">
					    <input type="text" class="form-control" id="suggestion1"  placeholder="Bowling">
					  </div>
					  <div class="form-group">
					    <input type="text" class="form-control" id="suggestion2"  placeholder="Ice Skating">
					  </div>
					  <div class="form-group">
					    <input type="text" class="form-control" id="suggestion3"  placeholder="Watch a movie">
					  </div>
				 	  <button type="submit" class="btn btn-primary">Create</button>
				</form>
			</div>
		</div>
	</div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>