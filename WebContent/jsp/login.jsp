<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>HIRED - Login</title>
    <!-- bootstrap css -->
    <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/custom.css">
</head>
<body >
    <div>
	<br/><br/><br/><br/>
	</div>
    <div class="container login-container" style="top:10%">
            
            <form action="login" method="post">
				
                <div class="row form-group">
                    <div class="col-lg-12" >
                    	<img src="img/77SFLogo.jpg" class="img-center" />      
						<!-- <img src="img/sfsevenlogo.jpg" class="img-center" /> -->			
                    </div>
                </div>
				<div class="row form-group">
                    <div class="col-lg-12" style="text-align:center">
                        <b class="error">${sessionScope.error}</b>
                    </div>
                </div>
                <div class="row form-group">
                    <div class="col-lg-3"></div>
                    <div class="col-lg-2">
                        <label> Email </label>                                 
                    </div>
                    <div class="col-lg-4">
                        <input type="text" name="email" class="form-control"/>
                    </div>
                </div>
                <div class="row form-group">
                    <div class="col-lg-3"></div>
                    <div class="col-lg-2">
                        <label> Passcode </label>                                 
                    </div>
                    <div class="col-lg-4">
                        <input type="password" name="passcode" class="form-control"/>
                    </div>
                </div>
                <div class="row form-group">
                    <div class="col-lg-4"></div>
                    <div class="col-lg-3">
                        
                    </div>
                    <div class="col-lg-4">
                        <input type="submit" class="btn btn-primary" style="width:150px;" value="Login" />
                    </div>
                </div>
            </form>
        </div>            

       
    <!-- jQuery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script src="js/sidebar_menu.js"></script>

</body>
</html>