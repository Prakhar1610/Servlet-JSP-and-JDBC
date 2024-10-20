<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>

<style>
       table, th, td 
       {
	       border: 1px solid black;
       }
</style>

<body style="background-color:#FFFFE0;">
      <div align="center">
           <h1>User Login</h1>

		<form action="loginForm" method="post">
			<table>
				<tr>
					<td>Email :</td>
					<td><input type="text" name="email1" /></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="pass1" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login" /></td>
					<td><input type="reset" /></td>
				</tr>

			</table>
		</form>
		
		<h3> New User ? </h3>
        <a href="SignUpServlet">Sign Up</a>
	</div>
</body>
</html>