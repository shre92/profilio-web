<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>ProfilioWeb</title>
		<script src="./assets/js/jQuery.js"></script>
		<script src="./assets/js/duplicateCheck.js"></script>
	</head>
	<body bgcolor="silver">
		<div align="center">
			<form method="post" name="userRegistration" action="registertheuser.html" >
				<table>
					<tr>
						<td>Username</td>
						<td><input type="text" name="username" id="username" required="required" onblur="checkDuplicateUser(this.value);"/></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" name="password" id="password" required="required"/></td>
					</tr>
					<tr>
						<td>First Name</td>
						<td><input type="text" name="firstname" id="firstname" required="required"/></td>
					</tr>
					<tr>
						<td>Last Name</td>
						<td><input type="text" name="lastname" id="lastname" required="required"/></td>
					</tr>
					<tr>
						<td>Gender</td>
						<td>
							<select name="gender" id="gender" required="required">
								<option value="">Please Select</option>
								<option value="Male">Male</option>
								<option value="Female">Female</option>
							</select>
						</td>
					</tr>
					<tr>
						<td>DOB</td>
						<td><input type="date" name="dob" id="dob" required="required"/></td>
					</tr>
					<tr>
						<td colspan="2" align="right"><button type="submit">Register</button></td>
					</tr>
					<c:if test="${not empty requestScope.userRegisteredSuccessfully}">
						<tr>
							<td colspan="2" align="center">${requestScope.userRegisteredSuccessfully}</td>
						</tr>
					</c:if>
				</table>
			</form>
		</div>
	</body>
</html>