<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>My Page</title>
		<script src="https://code.jquery.com/jquery-1.10.2.js" type="text/javascript"></script>
		<script src="Code.js" type="text/javascript"></script>
	</head>
	
	<body>
	<form id="Form">
		<table>
			<tr>
				<td>Day</td><td><input type="Number" name="d1"/></td>
			</tr>
			<tr>
				<td>Month</td><td><input type="Number" name="d2"/></td>
			</tr>
			<tr>
				<td>Year</td><td><input type="Number" name="d3"/></td>
			</tr>
			
			<tr>
				<td></td><td><input id = "btn" type="submit" value="Submit"/></td>
			</tr>
			<tr>
				<td>Result:</td><td><div id ="AjaxServletResponse">  </div> </td>
			</tr>
		</table>
	</form>
	</body>
</html>
