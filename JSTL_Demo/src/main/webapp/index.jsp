<%@ taglib prefix="c" uri="jakarta.tags.core" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <h1>This is JSTL example</h1>
     <!--1. out tag-->
     
     <!-- 2. set tag -->
     <c:set var="i" value="23" scope="application"></c:set>
     <h1><c:out value="${i}"></c:out></h1>
</body>
</html>