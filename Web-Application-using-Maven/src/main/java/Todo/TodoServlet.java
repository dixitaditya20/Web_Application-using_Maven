package Todo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.management.loading.PrivateClassLoader;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Todo.todoService;

/*
 * Browser sends Http Request to Web Server
 * 
 * Code in Web Server => Input:HttpRequest, Output: HttpResponse
 * JEE with Servlets
 * 
 * Web Server responds with Http Response
 */

//Java Platform, Enterprise Edition (Java EE) JEE6

//Servlet is a Java programming language class 
//used to extend the capabilities of servers 
//that host applications accessed by means of 
//a request-response programming model.

//1. extends javax.servlet.http.HttpServlet
//2. @WebServlet(urlPatterns = "/login.do")
//3. doGet(HttpServletRequest request, HttpServletResponse response)
//4. How is the response created?

@WebServlet(urlPatterns = "/todo.do")
public class TodoServlet extends HttpServlet {

	//Creating a User Validation Service
	private todoService todoservice = new todoService();

	// Creating a Get Request Method
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {	

		/*Creating a Parameter Get Request
		  Passing the Parameter from the Browser and Printing in Console Log*/
		
		request.setAttribute("todos", todoService.retrieveTodos());

		//Creating an connecting the JSP Page
		request.getRequestDispatcher("/WEB-INF/Views/todo.jsp").forward(request,response);
	}

}
