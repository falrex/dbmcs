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
import models.Project;
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
		 List<Task> tasks = (List<Task>)connection.retrieve("Select id, Type__c, Resource__c, Class__c, Project__c, Name from DB_Task__c where Resource__c = '" + resource.getId() + "'", Task.class);
		 
		 
		 for(Task task: tasks) {
			 if(task.getProject()!=null && !task.getProject().equals("")) {
				 ForceApi api = connection.getApi();
				 Project project= (Project) api.getSObject("DB_Project__c", task.getProject().toString()).as(Project.class);
				 task.setProject(project.getName());
			 }			
		 }
		 session.setAttribute("taskList", tasks);
	     request.getRequestDispatcher(redirect).forward(request, response);
	}
	
	
	public void doPost(HttpServletRequest request,
	  HttpServletResponse response) throws ServletException, IOException { 
	
	}
}
