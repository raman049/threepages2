package main.java.com.source.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.com.source.Validator.Validator;
import main.java.com.source.servlet.BO.BO;
import main.java.com.source.servlet.VO.InformationVO;

@WebServlet("/personalinfo")
public class personalinfo extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		InformationVO informationVO = new InformationVO();
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String middleName = request.getParameter("mname");
		String gender = request.getParameter("gender");
    	informationVO.setFirstName(firstName);
    	informationVO.setLastName(lastName);
    	informationVO.setMiddleName(middleName);
    	informationVO.setGender(gender);

    	String error= "";
    	
    	error += Validator.validatePersonalinfo(informationVO);
    	
    	System.out.println("First Name is" + firstName);
    	
    	request.getSession().setAttribute("personalinfoVO", informationVO);
    	if(error !=null && error.trim().length()!=0 ){
    		request.setAttribute("errorMsg", error);
    		RequestDispatcher rd = request.getRequestDispatcher("jsp/personalinfo.jsp");
    		rd.forward(request, response);
    	}else{
    		System.out.println(informationVO.getFirstName());
    		try {
		 		BO.personalInfoa(informationVO);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		RequestDispatcher rd = request.getRequestDispatcher("jsp/contactinfo.jsp");
    		
    		rd.forward(request, response);
    	} 
    	
       
	}


}
