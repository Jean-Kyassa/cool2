package john;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class John
 */
public class John extends HttpServlet {
	//private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(John.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public John() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		logger.info("Handling GET request");
		// Example of using different log levels
        logger.debug("Debug information: " + request.getRequestURI());
        logger.warn("Warning: This is a sample warning message");
        try {
            // Your existing code here
        } catch (Exception e) {
            logger.error("An error occurred while processing the request", e);
        }
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		logger.info("Handling POST request");
		logger.debug("Request parameters: " + request.getParameterMap());
		PrintWriter out=response.getWriter();
		String u="",p="";
		u=request.getParameter("txtuname");
		p=request.getParameter("txtpassword");
		if(u.equals("Jean Kyassa") && p.equals("25327")) {
			out.println("<h1>25327<br>"+u+"</h1>");
		}
		else {
			out.println("<h1>Login Failed</h1>");
		}
	}

}