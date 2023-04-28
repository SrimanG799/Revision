<%@page import="com.ciq.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Employee e=(Employee)request.getAttribute("employee");%>




<form action="./modify" method="post"><br>
<label>Eid</label><br>
<input type="text" name="eid" value="<%=e.getEid()%>" readonly="readonly"><br>
<label>Name</label><br>
<input type="text" name="name" value="<%=e.getName()%>"><br>
<label>Age</label><br>
<input type="text" name="age" value="<%out.print(e.getAge());%>"><br>
<label>Sector</label><br>
<input type="text" name="sector" value="<%=e.getSector()%>"><br>
<label>Organization</label><br>
<input type="text" name="organization" value="<%=e.getOrganization()%>"><br>
<label>Designation</label><br>
<input type="text" name="designation" value="<%=e.getDesignation()%>"><br>
<label>Experiance</label><br>
<input type="text" name="experiance" value="<%out.print(e.getExperiance());%>"><br>
<label>Salary</label><br>
<input type="text" name="salary" value="<%out.print(e.getSalary());%>"><br>
<input type="submit" value="save"><br>
</form>

</body>
</html>