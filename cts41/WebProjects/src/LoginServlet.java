

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DataBaseServlet
 */
@WebServlet("/DataBaseServlet")
public class LoginServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException{
try
{
int flag=0;
String ui=request.getParameter("uid");
String pw=request.getParameter("pwd");
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cts" ,"root","root");

Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select * from users");

response.setContentType("text/html");

PrintWriter out = response.getWriter();

out.println("<html><body>");

while(rs.next())
{
String t1=rs.getString(1);
String t2 =rs.getString(2);

if(ui.equals("t1")&& pw.equals("t2"))
{
flag=1;
break;
}
}

if((flag==1))
out.println("<b> Authorized User....</b>");
else
out.println("<b> Not Authorized User...</b>");

out.println("</body></html>");

out.close();
rs.close();
stmt.close();
con.close();

}
catch(Exception e)
{

}
}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}

}