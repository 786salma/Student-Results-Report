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
<form action="/StudentResults/home" method="post">
<br><br>
<table   class="table table-hover">
  <thead>
   <tr>
      <td scope="col">STUDENT NAME</td>
      <td scope="col">MATHS</td>
       <td scope="col">SCIENCE</td>
      <td scope="col">ENGLISH</td>
       <td scope="col">TOTAL OUT OF 300</td>
       <td scope="col">PROGRESS</td>
       <td scope="col">UPDATE</td>
    </tr>
  </thead>
  <% List<Students> fet = (List<Students>) request.getAttribute("fetch");
   for (Students e : fet) { %>
  <tbody>
<td><%=e.getSname() %></td>
<td><%=e.getMaths() %></td>
<td><%=e.getScience() %></td>
<td><%=e.getEnglish() %></td>

<td><%=(e.getMaths()+e.getEnglish()+e.getScience()) %></td>

<td><%
   int totalMarks = e.getMaths() + e.getEnglish() + e.getScience();
   if ( 300 < totalMarks)
   out.println("Invalid");
   else if (50 > e.getMaths())
   out.println("Failed in maths");
   else if (50 > e.getScience())
   out.println("Failed in science");
   else if (50 > e.getEnglish())
   out.println("Failed in english");
   else
  out.println("Passed");
  %></td>
 <td><input type="submit" class="btn btn-link" name="week" value="Update"></td>
<% } %>
 </tbody>
</form>
</body>
</html>