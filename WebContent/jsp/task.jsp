<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>HIRED - Verify Applicant</title>
    <!-- bootstrap css -->
    <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/custom.css">

    <script src="js/custom.js"> </script>
</head>
<body >
    <nav class="navbar navbar-inverse no-margin">
    <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header fixed-brand">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"  id="menu-toggle">
                      <span class="glyphicon glyphicon-th-large" aria-hidden="true"></span>
                    </button>
                    <a class="navbar-brand" href="#"> <img src="img/logo2.jpg" width="70" height="29" /></a>
                </div><!-- navbar-header-->
                
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav navbar-right" >
                                <li><a href="#">${sessionScope.user}</a></li>
                                <li ><a href="logout" data-toggle="tooltip" data-placement="bottom" title="Logout">
                                    <i class="fa fa-sign-out fa-lg "></i></a>   
                                </li>                               
                            </ul>
                </div><!-- bs-example-navbar-collapse-1 -->
    </nav>
 
    	
            <div class="container blur" style="width:85%;;min-height:86%" >
               
                		
		                <div class="row form-subheader top10">
		                    <div class="col-lg-10"> <b>Task List</b> </div>
		                    <div class="col-lg-2">  </div>
		                </div>
		                
		                <div class="row top5"></div>
		                <div class="row" >
		                	<div class="col-lg-2"> Record Type </div>
		                	<div class="col-lg-2"> Task Type </div>
		                	<div class="col-lg-4"> Task </div>
		                	<div class="col-lg-2"> Task Name </div>
		                	<div class="col-lg-2"> </div>
		                </div>
		                <c:forEach var="task" items="${sessionScope.taskList}" varStatus="loopStatus">
			                 <div class="row ${loopStatus.index % 2 == 0 ? 'z0':'z1' }" >
			                	<div class="col-lg-2"> ${task.recordType} </div>
			                	<div class="col-lg-2"> ${task.taskType} </div>
			                	<div class="col-lg-4"> ${task.task} </div>
			                	<div class="col-lg-2"> ${task.taskName} </div>
			                	<div class="col-lg-2"> <a href="taskdetails?taskId=${task.id}">View Details</a></div>
			                </div>
		                </c:forEach>
			                
            </div>
        </form>        
        <footer class="footer">
            <div class="container">
                <div class="row">
                    <div class="col-lg-9 col-lg-offset-2">
                      
                    </div>
                </div>    
            </div>
        </footer>
    <!-- jQuery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script src="js/sidebar_menu.js"></script>

</body>
</html>