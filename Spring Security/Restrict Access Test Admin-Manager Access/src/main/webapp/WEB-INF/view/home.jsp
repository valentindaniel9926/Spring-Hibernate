<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>

<head>
	<title> Miracle Company Home Page</title>
</head>

<body>
	<h2 style = "background-color:DodgerBlue;">Miracle Company Home Page</h2>
	<hr>
	
	<p style="background-color:DarkCyan;">Welcome to the Miracle company home page!</p>
	
		<hr>
	<!-- Display user id and role for the user -->

	<p>
		User: <security:authentication property="principal.username" />
		<br><br>
		 Role(s) : <security:authentication property="principal.authorities" />
	</p>
	<hr>
	
	<!-- Add a link to pint to /leaders -->
	
	<p>
	
	<a href="${pageContext.request.contextPath}/leaders">LeaderShip Meeting</a>
	(Only for Manager)
	</p>
	
	
	<!-- Add a link to point to /systems  -->
	<p>
	<a href="${pageContext.request.contextPath}/systems">Systems Meeting</a>
	(Only for Admin peoples)
	</p>
	
	<hr>


	<!-- Add a logout button -->
	<form:form action="${pageContext.request.contextPath}/logout" 
			   method="POST">
	
		<input type="submit" value="Logout" />
	
	</form:form>
	
</body>

</html>
