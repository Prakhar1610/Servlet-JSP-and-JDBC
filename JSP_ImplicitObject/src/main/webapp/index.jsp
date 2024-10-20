<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <%
         String name = "Prakhar";
         out.println(name);
       %>
       
       <%
          session.setAttribute("session_name" , "hello I'm under the water");
       %>
       
       <form action="output.jsp" method="get">
             <input type="text" name="name1" placeholder="Enter Name" />
             <input type="submit" value="Click Me" />
       </form>
</body>
</html>