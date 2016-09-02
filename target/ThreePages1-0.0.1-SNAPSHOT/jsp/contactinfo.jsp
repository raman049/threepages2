
	
<html>
<body style="background-color: yellow;">
<head>
<meta charset="UTF-8">
<title>Personal Information Page</title>
</head>
<h1 align="center">
	<font color="darkgreen"> CONTACT INFORMATION </font>
</h1>
<body>
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
	
	
	<form method="get" action="/ThreePages1/contactinfo">

		<table align="center">
			<tr>
				<td><label for="address"><i>Address</i></label></td>
				<td><input type="text" name="address" id="address"></td>
			</tr>
			<tr>
				<td><label for="city"><i>City</i></label></td>
				<td><input type="text" name="city" id="city"></td>
			</tr>
			<tr>
				<td><label for="state"><i>State </i></label></td>
				<td><input type="text" name="state" id="state"></td>
			</tr>
			<tr>
				<td><label for="country"><i>Country </i></label></td>
				<td >
				<select 
					width ="100%" name="country" id="country">
						<option value= ></option>
						<option value="usa">USA</option>
						<option value="uk">UK</option>
						<option value="france">France</option>
						<option value="german">German</option>
						<option value="japan">Japan</option>
						<option value="china">China</option>
						<option value="india">India</option>
						
				</select></td>
			</tr>
			<tr>
				<td><label for="phone"><i>Phone Number </i></label></td>
				<td><input type="text" name="phone" id="phone"></td>
			</tr>
		</table>

		<br> <br>
		<div style="text-align: center">
			<input type=submit name="submit" value="SUBMIT" />
		</div>
	</form>
</body>
</html>