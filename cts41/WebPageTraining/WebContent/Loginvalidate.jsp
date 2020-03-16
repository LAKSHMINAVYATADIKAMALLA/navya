<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int flag=0;
String ui=request.getParameter("username");
String pw=request.getParameter("password");
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Drivers loaded");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webproject","root","root");
System.out.println("connection established");
Statement statement=con.createStatement();
String query="select * from login";
ResultSet rs=statement.executeQuery(query);
while(rs.next())
{
String t1=rs.getString(1);
String t2 =rs.getString(2);
if(ui.equals(t1) && pw.equals(t2))
{
flag=1;
break;
}
}
if(flag==1)
{
%>
<jsp:include page="adminmenu.html" />
<% }
else
{
%>
<jsp:forward page="associate.html" />
<% }
rs.close();
con.close();
%> 

</body>
</html>
