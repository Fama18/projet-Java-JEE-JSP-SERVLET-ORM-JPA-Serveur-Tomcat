<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Accueil</title>
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" type="text/css">
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	<style>
	body {
	background-color:#5BA6DA;
	padding:200px;
	margin-left:200px;
	}
	div.col-md-8 {
	background-color: rgba(255, 255, 255, 0.8);
  	border-radius: 5px;
  	padding: 10px;
  	margin: 10px;
	}
	input[type=submit] {
	margin-left:170px;
	}
	</style>
	</head>
	<body>
	 <div class="container">
		<div class="col-md-8">			
			    	<form method="post" action="User">
			    		<div class="form-group">
					    	<label>Username : </label>
					    	<input class="form-control" type="text" name="email"/>
					    </div>
					    <div class="form-group">
					    	<label>Mot de passe : </label>
					    	<input class="form-control" type="password" name="password"/>
					    </div>
					    <div>
					    	<input class="btn btn-success" type="submit" value="Connexion"/>
					    </div>
			    	</form>
				

                </div>
              </div>
	</body>
</html>