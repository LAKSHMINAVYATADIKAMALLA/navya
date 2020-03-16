package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class ex1
 */
@WebServlet("/ex1")
public class ex1 extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ex1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.println("<html><body>");
		out.println("<b> Welcome to servlet Programmin </b>");
		out.println("</body></html>");
		out.close();
	}

}
