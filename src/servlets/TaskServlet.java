package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.force.api.ForceApi;

import models.Login;
import models.RecordType;
import models.Resource;
import models.Task;
import service.LoginService;
import service.SalesforceConnection;

public class TaskServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,
	            HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession();
		 String redirect = "jsp/task.jsp";
		 if (!LoginService.isLogin(session)) {
			  redirect="login";
		  }

		 Resource resource = (Resource) session.getAttribute("resource");
		 SalesforceConnection connection = (SalesforceConnection<Login>) session.getAttribute("connection");
		 List<Task> tasks = (List<Task>)connection.retrieve("Select id, RecordTypeId, Task_Type__c, Task__c, Resource__c, Task_Name__c from DB_Task__c where Resource__c = '" + resource.getId() + "'", Task.class);
		 session.setAttribute("taskList", tasks);
		 
		 for(Task task: tasks) {
			 String recordType = task.getRecordType();
			 ForceApi api = connection.getApi();
			 RecordType recordTypeObject= (RecordType) api.getSObject("RecordType", task.getRecordType().toString()).as(RecordType.class);
			 task.setRecordType(recordTypeObject.getName());
		 }
		 
	     request.getRequestDispatcher(redirect).forward(request, response);
	}
	
	
	public void doPost(HttpServletRequest request,
	  HttpServletResponse response) throws ServletException, IOException { 
	
	}
}
