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


public class bankinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		InformationVO informationVO = new InformationVO();
		String bank = request.getParameter("bank");
    	String account = request.getParameter("account");
    	String ssn = request.getParameter("ssn");    
    	informationVO.setBank(bank);
    	informationVO.setAccount(account);
    	informationVO.setSsn(ssn);
    	String error= "";
    	error += Validator.validateBankinfo(informationVO);
    	System.out.println("bank is " + bank);
    	System.out.println("ssn is " + ssn);
    	request.getSession().setAttribute("bankinfoVO", informationVO);
    	

    	if(error !=null && error.trim().length()!=0 ){
    		request.setAttribute("errorMsg", error);
    		RequestDispatcher rd = request.getRequestDispatcher("jsp/bankinfo.jsp");
    		rd.forward(request, response);
    	}else{
    		try {
				BO.bankInfo(informationVO);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		RequestDispatcher rd = request.getRequestDispatcher("jsp/output.jsp");
    		rd.forward(request, response);
    	}
	}


}
