package main.java.com.source.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.com.source.Validator.Validator;
import main.java.com.source.servlet.BO.BO;
import main.java.com.source.servlet.VO.InformationVO;


public class contactinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		InformationVO informationVO = new InformationVO();
		String address = request.getParameter("address");
    	String city = request.getParameter("city");
    	String state = request.getParameter("state");
    	String country = request.getParameter("country");
    	String phone = request.getParameter("phone"); 
    	informationVO.setAddress(address);
    	informationVO.setCity(city);
    	informationVO.setState(state);
    	informationVO.setCountry(country);
    	informationVO.setPhone(phone);
    	String error= "";
    	error += Validator.validateContactinfo(informationVO);
    	
    	System.out.println("address is " + address);
    	System.out.println("city is " + city);
    	
    	
    	
    	request.getSession().setAttribute("contactinfoVO", informationVO);

    	if(error !=null && error.trim().length()!=0 ){
    		request.setAttribute("errorMsg", error);
    		RequestDispatcher rd = request.getRequestDispatcher("jsp/contactinfo.jsp");
    		rd.forward(request, response);
    	}else{
    		try {
				BO.contactInfo(informationVO);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		RequestDispatcher rd = request.getRequestDispatcher("jsp/bankinfo.jsp");
    		rd.forward(request, response);
    	}
     
	}


}
