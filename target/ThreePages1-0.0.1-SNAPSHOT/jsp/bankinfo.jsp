

<html>
<body style="background-color: yellow;">
	<%
		System.out.println("Evaluating date now");
		java.util.Date date = new java.util.Date();
	%>

	<%
		Object messageB = (String) request.getAttribute("errorMsg");
		String errorMessageB = "";
		if (messageB != null) {
			errorMessageB = (String) messageB;
	%>
	<%=errorMessageB%>
	<%
		}
	%>

<head>
<meta charset="UTF-8">
<title>Bank Information Page</title>
</head>
<h1 align="center">
	<font color="darkgreen"> BANK INFORMATION </font>
</h1>
<body>
	<form method="get" action="/ThreePages1/bankinfo">

		<table align="center">

			<tr>
				<td><label for="bank"><i>Bank</i></label></td>
				<td><select width="100%" name="bank" id="bank">
						<option value=></option>
						<option value="chase">Chase</option>
						<option value="usbank">US Bank</option>
						<option value="bankofamerica">Bank of America</option>
						<option value="money">Money</option>
				</select></td>
			</tr>
			<tr>
				<td><label for="account"><i>Account Number</i></label></td>
				<td><input type="text" name="account" id="account"></td>
			</tr>
			<tr>
				<td><label for="ssn"><i>S.S.N. </i></label></td>
				<td><input type="text" name="ssn" id="ssn"></td>
			</tr>


		</table>

		<br> <br>
		<div style="text-align: center">
			<input type=submit name="submit" value="SUBMIT" />
		</div>
	</form>
</body>
</html>