<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>MCS - Tasks</title>
    
    <!-- bootstrap css -->
    <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/custom.css">

    <!-- jQuery -->
    <link rel="stylesheet" href="https://code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    
    <script src="js/custom.js"> </script>
    <script>
    	
        $(function() {
            $( ".datepicker" ).datepicker({changeYear: true, changeMonth: true });
            
        });
    </script>
    
    
    
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
 
        <div class="container background-white blur" style="width:80%;" >             
            <div class="row top15"></div>
          
            <div class="row form-header">
                <div class="col-lg-10"> <b>Information</b> </div>
                <div class="col-lg-2 required-instructions"> <span class="required-icon"> &nbsp </span> &nbsp Required</div>
            </div>
            
            <div class="row top5"></div>
           
            <div class="row top7">
                <div class="col-lg-3 bordered"><span class="required-icon"> &nbsp </span><label>&nbsp Resource Full Name</label> </div>                    
                <div class="col-lg-3 bordered">	 ${taskDetails.resource}  </div>
			</div>
            <div class="row top7">
                <div class="col-lg-3 bordered"><label>Project </label></div>                    
                <div class="col-lg-3 bordered">  ${taskDetails.project}  </div>    
            </div>
            <div class="row top7">
                <div class="col-lg-3 bordered"><label> Task Type</label></div>                    
                <div class="col-lg-3 bordered">  ${taskDetails.taskType} </div>
			</div>
            <div class="row top7">
                <div class="col-lg-3 bordered"><label> Task</label></div>                    
                <div class="col-lg-3 bordered">  ${taskDetails.task}  </div>    
            </div>
            <div class="row top7">
                <div class="col-lg-3 bordered"><label> Task Name </label></div>                    
                <div class="col-lg-3 bordered">  ${taskDetails.taskName} </div>
			</div>
            <div class="row top7">
                <div class="col-lg-3 bordered"><label> Description </label></div>                    
                <div class="col-lg-3 bordered">  ${taskDetails.description} </div>
            </div>
            
            <div class="row form-header top10">
                <div class="col-lg-10"> <b>Details</b> </div>
               
            </div>
            
            <div class="row top5"></div>
          
            
            <div class="row top7">
                <div class="col-lg-3 bordered"><label> Forecast Hours </label></div>                    
                <div class="col-lg-3 bordered">  ${taskDetails.forecastHours} </div>
                
                <div class="col-lg-3 bordered"><label> Actual Hours </label></div>                    
                <div class="col-lg-3 bordered">  ${taskDetails.actualHours} </div>
			</div>
            <div class="row top7">
                <div class="col-lg-3 bordered"><label> Planned Start Date # </label></div>                    
                <div class="col-lg-3 bordered">  ${taskDetails.plannedStartDate}  </div>
                
                <div class="col-lg-3 bordered"><label> Actual Start Date # </label></div>                    
                <div class="col-lg-3 bordered">  ${taskDetails.actualStartDate}  </div>
            </div>
			<div class="row top7">
                <div class="col-lg-3 bordered"><label> Planned Finish Date</label></div>                    
                <div class="col-lg-3 bordered">  ${taskDetails.plannedFinishDate}  </div>
                
                <div class="col-lg-3 bordered"><label> Actual Finish Date</label></div>                    
                <div class="col-lg-3 bordered">  ${taskDetails.actualFinishDate}  </div>        
            </div>                           
            
            <div class="row top7">
                <div class="col-lg-3 bordered"><label> Schedule Variance </label></div>                    
                <div class="col-lg-3 bordered">  ${taskDetails.scheduleVariance } </div>
			</div>
            
            <div class="row form-header top10">
                <div class="col-lg-10"> <b>Review </b> </div>
               
            </div>
            
            <div class="row top5"></div>
            <div class="row top7">
                <div class="col-lg-3 bordered"><label> Number of Revisions </label></div>                    
                <div class="col-lg-3 bordered">  ${taskDetails.numberOfRevisions} </div>
                <div class="col-lg-3 bordered"><label> Deliverable </label></div>                    
                <div class="col-lg-3 bordered">  ${taskDetails.deliverable}  </div>    
            </div>
            <div class="row top7">
                <div class="col-lg-3 bordered"><label> Details of Changes </label></div>                    
                <div class="col-lg-3 bordered">  ${taskDetails.detailsOfChanges} </div>
                <div class="col-lg-3 bordered"><label> Number of Business Requirements </label></div>                    
                <div class="col-lg-3 bordered">  ${taskDetails.numberOfBusinessRequirements}  </div>    
            </div>
            <div class="row top7">
                <div class="col-lg-3 bordered"><label> Negative Review Points </label></div>                    
                <div class="col-lg-3 bordered">  ${taskDetails.negativeReviewPoints} </div> 
                <div class="col-lg-3 bordered"><label> Number of Functional Requirements </label></div>                    
                <div class="col-lg-3 bordered">  ${taskDetails.numberOfFunctionalRequirements} </div> 
            </div>
			<div class="row top7">
                <div class="col-lg-3 bordered"><label> Negative Review Remarks </label></div>                   
                <div class="col-lg-3 bordered">  ${taskDetails.negativeReviewRemarks} </div>            
                <div class="col-lg-3 bordered"><label> Number of Test Cases </label></div>                    
                <div class="col-lg-3 bordered">  ${taskDetails.numberOfTestCases}  </div>    
            </div>
            
            <div class="row top15"></div>
            
     
        </div>
        <br/>
       
        <div class="container blur" style="width:85%;;min-height:86%" >
               			 <div class="row top15"></div>
               			 
		                <div class="row form-header top10">
		                    <div class="col-lg-10"> <b>Task List</b> </div>
		                    <div class="col-lg-2">  </div>
		                </div>
		                
		                <div class="row top5"></div>
		                <div class="row" >
		                	<div class="col-lg-2"> TS #  </div>
		                	<div class="col-lg-2"> Date </div>
		                	<div class="col-lg-2"> Day  </div>
		                	<div class="col-lg-2"> Number of Hours</div>
		                </div>
		                <c:forEach var="timesheet" items="${sessionScope.timesheets}" varStatus="loopStatus">
			                 <div class="row ${loopStatus.index % 2 == 0 ? 'z0':'z1' }" >
			                	<div class="col-lg-2"> ${timesheet.name} </div>
			                	<div class="col-lg-2"> ${timesheet.date} </div>
			                	<div class="col-lg-2"> ${timesheet.day} </div>
			                	<div class="col-lg-2"> ${timesheet.numberOfHours} </div>
			                </div>
		                </c:forEach>
			                
            </div>
        
        <br>
        
     	<form name="timesheetForm" method="post" action="taskdetails" class="contact_form"> 
	        <div class="container background-white blur" style="width:80%;" >             
                <div class="row top15"></div>
              
                <div class="row top15"></div>
                
                <div class="row form-header">
                    <div class="col-lg-10"> <b>Add to Timesheet</b> </div>
                    <div class="col-lg-2 required-instructions"> <span class="required-icon"> &nbsp </span> &nbsp Required</div>
                </div>
                
                <div class="row top5"></div>
               
                <div class="row top7">
                    
                    
                    <div class="col-lg-3 bordered"><label> Date </label></div>                    
                    <div class="col-lg-3 bordered">  <input type="text" class="form-control datepicker" name="date">  </div> 

					<div class="col-lg-3 bordered"><label> # of Hours </label></div>                    
	                <div class="col-lg-3 bordered">  <input type="text" class="form-control" required name="numberOfHours"></div>   
                </div>
                
                
                <div class="top10 background-gray">
                    
                </div>
                
                <div class="row top7">
                    <div class="col-lg-9 bordered"></div>                                
                    <div class="col-lg-3 bordered">  <input type="Submit" class="form-control btn btn-primary">  </div>    
                </div>
                
                <div class="row top15">
                	 <div class="col-lg-9 bordered"></div>      
                </div>
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
    


</body>
</html>