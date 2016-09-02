

<html>

<body style="background-color: yellow;">
	<%
		System.out.println("Evaluating date now");
		java.util.Date date = new java.util.Date();
	%>

	<%
		Object message = (String) request.getAttribute("errorMsg");
		String errorMessage = "";
		if (message != null) {
			errorMessage = (String) message;
	%>
	<%=errorMessage%>
	<%
		}
	%>
	<h1 align="center">
		<font color="red"> Welcome Page </font>
	</h1>

	<form method="get" action="/ThreePages1/personalinfo">

		<table align=center>
			<tr>
				<td><label for="fname"><i>First Name</i></label></td>
				<td><input type="text" name="fname" id="fname"></td>
			</tr>
			<tr>
				<td><label for="lname"><i>Last Name</i></label></td>
				<td><input type="text" name="lname" id="lname"></td>
			</tr>
			<tr>
				<td><label for="mname"><i>Middle Name</i></label></td>
				<td><input type="text" name="mname" id="mname"></td>
			</tr>
			<tr>
				<td><label for="gender"><i>Gender</i></label></td>
				<td><input type="radio" name="gender" id="gender" value="male">Male
					<input type="radio" name="gender" id="gender" value="female">Female</td>
			</tr>
		</table>

		<br>
		<div style="text-align: center">
			<input type=submit name="submit" value="SUBMIT" />
		</div>
	</form>

</body>
</html>