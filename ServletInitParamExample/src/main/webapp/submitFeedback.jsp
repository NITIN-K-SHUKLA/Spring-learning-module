<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback page</title>
</head>
<body>
	<h1>Submit your feedback</h1>
	<form action="feedbackServlet" method="post">
		<textarea rows="10" name="feedbackParam"></textarea>
		<input type="submit" name="submit" value="Submit Feedback">
	</form>
</body>
</html>