<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.sql.*"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
try
{
int uno=Integer.parseInt(request.getParameter("enum"));
String uname=request.getParameter("enam");
String ujob=request.getParameter("ejob");
int umgr=Integer.parseInt(request.getParameter("emgr"));
String uhd=request.getParameter("ehd");
String usal=request.getParameter("esal");
String ucomm=request.getParameter("ecom");
int udept=Integer.parseInt(request.getParameter("edept"));
int enumber=Integer.parseInt(request.getParameter("enumber"));

DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
String sql ="UPDATE emp SET empno=?,ename=?,job=?,mgr=?,hiredate=?,sal=?,comm=?,deptno=? where empno=?";
PreparedStatement pst=connection.prepareStatement(sql);
pst.setInt(1,uno);
pst.setString(2,uname);
pst.setString(3,ujob);
pst.setInt(4,umgr);
pst.setString(5,uhd);
pst.setString(6,usal);
pst.setString(7,ucomm);
pst.setInt(8,udept);
pst.setInt(9,enumber);

int count=pst.executeUpdate();
if(count!=0)
{
out.print("updated successfully");
}
else
{
out.print("updated unsuccessfully");
}
pst.close();
connection.close();
}
catch(Exception e)
{
out.println(e);
}

%>
</body>
</html>
