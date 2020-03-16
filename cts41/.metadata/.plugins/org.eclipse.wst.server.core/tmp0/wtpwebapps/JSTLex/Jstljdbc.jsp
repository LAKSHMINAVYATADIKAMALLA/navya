<%@ page import="java.io.*,java.util.*,java.sql.*" %>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
<head>
<title>Sql:Query Tag</title>
</head>
<body>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost/cts"
user="root" password="root" />
 


<sql:query dataSource="${db}" var="rs">  
SELECT * from Student;  
</sql:query>  

<table border="2" width="100%">  
<tr>  
<th>StudentID</th>  
<th>FirstName</th>  
<th>LastName</th>  
<th>Age</th>  
</tr>

<c:forEach var="table" items="${rs.rows}">  
<tr>  
<td><c:out value="${table.htno}"/></td>  
<td><c:out value="${table.name}"/></td>  
<td><c:out value="${table.branch}"/></td>  
<td><c:out value="${table.clg}"/></td>  
</tr>  
</c:forEach> 

 
</table>  

</body>
</html>