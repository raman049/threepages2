package main.java.com.source.servlet.BO;

import main.java.com.source.servlet.DAO.DAO;
import main.java.com.source.servlet.VO.InformationVO;

public class BO {
	
	public static String personalInfoa(InformationVO informationVO) throws Exception{
		DAO.personalInfoa(informationVO);
		return "";
	}
	public static String contactInfo(InformationVO informationVO) throws Exception{
		DAO.contactInfo(informationVO);
		return "";
	}
	public static String bankInfo(InformationVO informationVO) throws Exception{
		DAO.bankInfo(informationVO);
		return "";
	}

}
