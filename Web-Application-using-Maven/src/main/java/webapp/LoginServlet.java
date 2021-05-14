package webapp;

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

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	//Creating a User Validation Service
	private UserValidationService services = new UserValidationService();
	private todoService todoservice = new todoService();

	//	@Override
	//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	//		PrintWriter out = response.getWriter();
	//		out.println("<html>");
	//		out.println("<head>");
	//		out.println("<title>Yahoo!!!!!!!!</title>");
	//		out.println("</head>");
	//		out.println("<body>");
	//		out.println("My First Servlet");
	//		out.println("</body>");
	//		out.println("</html>");
	//
	//	}


	// Creating a Get Request Method
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {	

		/*Creating a Parameter Get Request
		  Passing the Parameter from the Browser and Printing in Console Log*/
		request.getParameter("name");

		request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("password", request.getParameter("password"));

		//Creating an connecting the JSP Page
		request.getRequestDispatcher("/WEB-INF/Views/todo.jsp").forward(request,response);
	}

	//Creating a Post Method request
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		//Calling User invalidService

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		request.setAttribute("name",name);
		request.setAttribute("password",password);

		boolean isUserValid = services.isUserValid(name, password);

		if(isUserValid) {

			//Creating an connecting the JSP Page
			request.getSession().setAttribute("name", name);
			response.sendRedirect("/todo.do");
		}

		else {
			request.setAttribute("errorMessage","Invalid Credential");
			request.getRequestDispatcher("/WEB-INF/Views/login.jsp").forward(request,response);
		}
	}

}
