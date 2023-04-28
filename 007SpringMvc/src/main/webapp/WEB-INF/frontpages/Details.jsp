<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.ciq.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Employee> AllEmp=(List<Employee> )request.getAttribute("allData");%>
<table border="3px">
<tr><td>EmpId</td><td>Name</td><td>Age</td><td>Organization</td><td>Sector</td><td>Experience</td><td>Designation</td><td>Salary</td>
<td>Update</td><td>Delete</td></tr>
<%
for(Employee emp:AllEmp)
{
%>
<tr>
<td><%=emp.getEid()%></td>
<td><%=emp.getName() %></td>
<td><%=emp.getAge() %></td>
<td><%=emp.getOrganization() %>
<td><%=emp.getSector() %></td>
<td><%=emp.getExperiance() %></td>
<td><%=emp.getDesignation() %></td>
<td><%=emp.getSalary() %></td>
<td><a href="update?id=<%=emp.getEid()%>">Update</a></td>
<td><a href="delete?id=<%=emp.getEid()%>">Delete</a></td>


</tr>





<%
}%>
</table>

</body>
</html>