package servlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.force.api.ForceApi;

import models.Login;
import models.Project;
import models.Resource;
import models.Task;
import models.Timesheet;
import service.LoginService;
import service.SalesforceConnection;

public class TaskDetailsServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,
	            HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession();
		 String redirect = "jsp/taskDetails.jsp";
		 String taskId = request.getParameter("taskId");
		 if (!LoginService.isLogin(session)) {
			  redirect="login";
		  }
	
	//	 Resource resource = (Resource) session.getAttribute("resource");
		 SalesforceConnection connection = (SalesforceConnection<Login>) session.getAttribute("connection");
		 //
		 List<Task> taskDetailsList = (List<Task>)connection.retrieve("Select id, RecordTypeId, Resource__c, Project__c, Task_Type__c, Task__c, "
		 													+ "Task_Name__c, Description__c, Forecast_Hours__c, Planned_Start_Date__c, "
		 													+ "Planned_Finish_Date__c, Number_of_Revisions__c, Deliverable__c, Details_of_Changes__c, "
		 													+ "Number_of_Business_Requirements__c, Negative_Review_Remarks__c, Number_of_Functional_Requirements__c,"
		 													+ "Number_of_Test_Cases__c from DB_Task__c where id = '" + taskId + "'", Task.class);
		 
		 ForceApi api = connection.getApi();
		 Resource resource= (Resource) api.getSObject("DB_Resource__c", taskDetailsList.get(0).getResource().toString()).as(Resource.class);
		 Task taskDetails = new Task();
		 
		 Project project= (Project) api.getSObject("DB_Project__c", taskDetailsList.get(0).getProject().toString()).as(Project.class);
		 
		 List<Timesheet> timesheets = (List<Timesheet>)connection.retrieve("Select Name, Date__c, Day__c,Task_Type__c,Number_of_hours__c,Service_Area__c from DB_Timesheet__c where Task__c ='" + taskId + "'", Timesheet.class);
		
		 //only get the first on the list
		 if (taskDetailsList != null && !taskDetailsList.isEmpty()) {
			 taskDetails = taskDetailsList.get(0);
			 taskDetails.setResource(resource.getName());
			 taskDetails.setProject(project.getName());
			 session.setAttribute("taskDetails", taskDetails);
		 } 
		 
		 if(timesheets != null && !timesheets.isEmpty()) {
			 session.setAttribute("timesheets", timesheets);
		 }
	 
	     request.getRequestDispatcher(redirect).forward(request, response);
	}
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		HttpSession session = request.getSession();
		SalesforceConnection connection = (SalesforceConnection<Login>) session.getAttribute("connection");
		 
		String redirect = "taskdetails?";
		if (!LoginService.isLogin(session)) {
			  redirect="login";
		}
		
		//Create object to save into
		Timesheet ts = new Timesheet();
		
		//get and set the form fields
		
		
		Task taskDetails = (Task) session.getAttribute("taskDetails");
		String task = taskDetails.getId();
		String date = request.getParameter("date");
		String numberOfHours = request.getParameter("numberOfHours");

		ts.setTask(task);
		ts.setDate(date);
		ts.setNumberOfHours(numberOfHours);
		
		//format date fields
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
	    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");     
	    try {
	    	if(ts.getDate() != null && !ts.getDate().equals("") ) {
	    		  ts.setDate(String.valueOf( df.format(dateFormat.parse(date)) ));
	    	 } else {
	    		  ts.setDate(null);
	    	 }
	    } catch (ParseException e1) {
	    	 e1.printStackTrace();
	    }
	    
	    //insert into salesforce
	    connection.create("DB_Timesheet__c", ts);
	    
	    redirect += "taskId=" + task;
	    
	    response.sendRedirect(redirect);
	}
}
