package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.force.api.ForceApi;

import models.Resource;
import models.Login;
import service.SalesforceConnection;

// Extend HttpServlet class
public class LoginServlet extends HttpServlet {
 
  private String message;

  public void init() throws ServletException
  {
      // Do required initialization
      message = "Hello World";
  }

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response) throws ServletException, IOException { 
      request.getRequestDispatcher("jsp/login.jsp").forward(request, response);
  }
  
  
  public void doPost(HttpServletRequest request,
          HttpServletResponse response) throws ServletException, IOException { 
	  
	  HttpSession session = request.getSession();
	  session.removeAttribute("error");
	  //String username = request.getParameter("username").trim();
      //String password = request.getParameter("password").trim();
      //String securityToken = request.getParameter("securityToken").trim();
      
      String email = request.getParameter("email").trim();
      String passcode = request.getParameter("passcode").trim();
      //String email = "ddiego@77global.biz";
      
      SalesforceConnection connection = new SalesforceConnection();
      
      String redirect="task";
      
      
      try {
    	  connection.connect();
    	  
    	  //QueryResult<Map> access = connection.query("Select id from Resource_Confirmation__c where email__c='" + email + "' and status__c='Open' and passcode__c='" + passcode + "'");
    	  List<Login> access = connection.retrieve("Select id, Resource__c, Password__c from DB_MCS_Login__c where Resource__c IN (Select id from DB_Resource__c where Email_Address__c='" + email + "')",Login.class);
    	  if(access.size()>0 && passcode.equals(access.get(0).getPassword())) {
    		  redirect = "task";
    		  ForceApi api = connection.getApi();    		  
    		  Resource resource= (Resource) api.getSObject("DB_Resource__c", access.get(0).getResource().toString()).as(Resource.class);
    		  //Applicant resourceConfirmation = api.getSObject("Resource__c", "a014B000001l6Sb").as(Applicant.class);
    		  session.setAttribute("resource", resource);
    	  } else {
    		  session.setAttribute("error", "Invalid Login Details. Please Try Again");
    		  redirect = "login";
    	  }
      } catch (RuntimeException e) {
    	  session.setAttribute("error", "Invalid Login Details. Please Try Again");    	  
    	  redirect = "login";
      }
      
      if(redirect.equals("task")) {
    	  session.removeAttribute("error");
    	  session.setAttribute("user", email);
    	  session.setAttribute("connection", connection);      
      }
	     
      response.sendRedirect(redirect);
      
    	  
  }
  
  public void destroy()
  {
      // do nothing.
  }
}