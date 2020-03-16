<%@ page import="java.io.*,java.util.*,java.sql.*" %>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:update dataSource="${db}" var="count">
insert into students values (1056,'anil','OU');
</sql:update>sql:updates>

<c:set var="name" value="<%=request.getParameter(\"name\") %>" />
<c:set var="branch" value="<%=request.getParameter(\"brnch\") %>" />
<c:set var="clg" value="<%=request.getParameter(\"clg\") %>" />


</body>
</html>