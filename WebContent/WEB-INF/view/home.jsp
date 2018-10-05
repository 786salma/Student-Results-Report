<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
     import="java.util.List,com.ibm.java.result.entity.Students,com.ibm.java.result.apis.StudentImple"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Student Report</title>

<h2 style="text-align:center;color:blue"><%=request.getAttribute("pass") %></h2>

</head>

<body>
<div class="card text-center">
<br><br>

<FORM action="/StudentResults/getstudents" method="post">
<label>Choose Student Name</label>
<select name="student"class="btn btn-info dropdown-toggle">
<% List<Students> stud = (List<Students>) request.getAttribute("student");
   for (Students e : stud) { %>
<option value=<%=e.getSname() %>><%out.println(e.getSname());%></option>
<%  } %>			
</select>
<br><br> 
<label >Enter MATHS marks:</label>
<input type="number" name="maths"  min="20" max="300"><br><br>
<label >Enter SCIENCE marks:</label>
<input type="number" name="science"  min="20" max="300" ><br><br>
<label >Enter ENGLISH marks:</label>
<input type="number" name="english"   min="20" max="300"><br><br>
<input type="submit" value="Submit" class="btn btn-success">
</body>
</div>

</html>