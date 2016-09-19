<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style>
 body{

background-image: url('C:\Users\admin\Desktop\project\images\ROYAL-ENFIELD-BULLET.jpg');
background-repeat;
}

.carousel-inner > .item > img,
.carousel-inner > .item > a > img {
width:800px;
height:400px;
  margin:auto;
}

</style>

</head>
<body>
<nav class="navbar navbar-inverse">
 
    <div class="navbar-header">
      <a class="navbar-brand" href="#">NfS</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">HOME</a></li>
      <li><a href="#">CARS</a></li>
   
      <li><a href="#">LOCATE US</a></li>
      <li><a href="#">ABOUT US</a></li>

 </ul>
    <ul class="nav navbar-nav navbar-right">
    <li><a href="log.jsp"><span class="glyphicon glyphicon-log-in"></span> LOGIN</a></li>
      <li><a href="signup.jsp"><span class="glyphicon glyphicon-user"></span> REGISTER</a></li>
      <li><span>xxxxxxxxxxxx</span></li>
     
    </ul>
  
</nav>

<form data-toggle="validator" role="form">
<div class="col-xs-3">

  <div class="form-group">
    <label for="inputName" class="control-label">USERNAME</label>
    <input type="text" class="form-control" id="inputName" placeholder="Cina Saffary" required>
  </div>
    <div class="form-group">
    <label for="inputPassword" class="control-label">Password</label>
    <div class="form-inline row">
 <div class="form-group col-sm-6">
        <input type="password" class="form-control" id="inputPasswordConfirm" data-match="#inputPassword" data-match-error="Whoops, these don't match" placeholder="Confirm" required>
        <div class="help-block with-errors"></div>
      </div>
	  <div class="form-group">
    <div class="checkbox">
      <label>
        <input type="checkbox" id="terms" data-error="Before you wreck yourself" required>
        Check yourself
      </label>
      <div class="help-block with-errors"></div>
    </div>
  </div>
  <div class="form-group">
    <button type="submit" class="btn btn-primary">Submit</button>
  </div><style>
body {
        margin: auto;
        background-image: url("images/car4.jpg");
} 
 
</style>
</form>
</body>
</html>

