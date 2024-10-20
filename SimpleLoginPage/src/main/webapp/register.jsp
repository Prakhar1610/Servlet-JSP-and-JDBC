<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
</head>

<style>
       table, th, td 
       {
	       border: 1px solid black;
       }
</style>

<body style="background-color:#FFFFE0;">
      <div align="center">
           <h1>User Registration</h1>
           
           <form action="regForm" method="post">
			<table>
				<tr>
					<td>Name : </td>
					<td><input type="text" name="name1" /></td>
				</tr>
				<tr>
					<td>Email : </td>
					<td><input type="text" name="email1" /></td>
				</tr>
				<tr>
					<td>Password : </td>
					<td><input type="password" name="pass1" /></td>
				</tr>
				<tr>
					<td>Gender : </td>
					<td><input type="radio" name="gender1" value="Male" /> Male <input type="radio" name="gender1" value="Female" /> Female </td>
				</tr>
				<tr>
					<td>City : </td>
					<td>
					    <select name="city1">
                           <option> Select City <option/>
                           <option> Delhi <option/>
                           <option> Mumbai <option/>
                           <option> Pune <option/>
                           <option> Banglore <option/>
                           <option> Lucknow <option/>
                           <option> Select City <option/>
                   </select>
					</td>
				</tr>
				<tr>
					<td><input type="submit" value="Register" /></td>
					<td><input type="reset" /></td>
				</tr>
			</table>
		</form>
		
		<h3> Already a User ? </h3>
        <a href="SignInServlet">Sign In</a>
      </div>
</body>
</html>