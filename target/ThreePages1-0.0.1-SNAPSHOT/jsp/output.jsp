<HTML>
<BODY>
	<%
		// This is a scriptlet.  Notice that the "date"
		// variable we declare here is available in the
		// embedded expression later on.
		System.out.println("Evaluating date now");
		java.util.Date date = new java.util.Date();
	%>
	<font color="green"> Todays Date: <%=date%></font>

	<h1 align="center">
		<font color="red"> Output Page </font>
	</h1>
	<font color="blue">================ You entered following Values
		==================</font>
	<br>
	<br>
	<br>
	<jsp:useBean id="bankinfoVO"
		class="main.java.com.source.servlet.VO.InformationVO" scope="session">
	</jsp:useBean>
	<jsp:useBean id="personalinfoVO"
		class="main.java.com.source.servlet.VO.InformationVO" scope="session">
	</jsp:useBean>
	<jsp:useBean id="contactinfoVO"
		class="main.java.com.source.servlet.VO.InformationVO" scope="session">
	</jsp:useBean>
	<%
		String varFirstName = (String) personalinfoVO.getFirstName();
		String varLastName = (String) personalinfoVO.getLastName();
		String varMiddleName = (String) personalinfoVO.getMiddleName();
		String vargender = (String) personalinfoVO.getGender();
		String varaddress = (String) contactinfoVO.getAddress();
		String varcity = (String) contactinfoVO.getCity();
		String varstate = (String) contactinfoVO.getState();
		String varcountry = (String) contactinfoVO.getCountry();
		String varphone = (String) contactinfoVO.getPhone();
		String varssn = (String) bankinfoVO.getSsn();
		String varbank = (String) bankinfoVO.getBank();
		String varacc = (String) bankinfoVO.getAccount();
	%>
	<%
		if (varFirstName != null) {
	%>
	FitstName =
	<%=varFirstName%>
	<br>
	<%
		}
	%>
	<%
		if (varLastName != null) {
	%>
	LastName =
	<%=varLastName%>
	<br>
	<%
		}
	%>
	<%
		if (varMiddleName != null) {
	%>
	MiddleName =
	<%=varMiddleName%>
	<br>
	<%
		}
	%>
	<%
		if (vargender != null) {
	%>
	Gender =
	<%=vargender%>
	<br>
	<%
		}
	%>
	<%
		if (varcity != null) {
	%>
	City =
	<%=varcity%>
	<br>
	<%
		}
	%>
	<%
		if (varbank != null) {
	%>
	Bank =
	<%=varbank%>
	<br>
	<%
		}
	%>
	
	
	<br>
	<font color="blue">================ End of the
		display=============================</font>
</BODY>
</HTML>