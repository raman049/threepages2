package main.java.com.source.Validator;

import main.java.com.source.servlet.VO.InformationVO;

public class Validator {
	public static String validatePersonalinfo(InformationVO informationVO) {
		StringBuffer sb = new StringBuffer();
		sb.append(validateFirstName(informationVO.getFirstName()));
		sb.append(validateMiddleName(informationVO.getMiddleName()));
		sb.append(validateLastName(informationVO.getLastName()));

		return sb.toString();
	}

	public static String validateContactinfo(InformationVO informationVO) {
		StringBuffer sb = new StringBuffer();

		sb.append(validateAddress(informationVO.getAddress()));
		sb.append(validatePhoneno(informationVO.getPhone()));

		return sb.toString();
	}

	public static String validateBankinfo(InformationVO informationVO) {
		StringBuffer sb = new StringBuffer();
		sb.append(validateBank(informationVO.getBank()));
		sb.append(validateAccount(informationVO.getAccount()));
		sb.append(validateSSN(informationVO.getSsn()));

		return sb.toString();
	}

	public static String validateLastName(String lastName) {
		String error = "";
		if (isFieldEmpty(lastName)) {
			error += "Last Name cannot be blank<br>";
		}
		return error;
	}

	public static boolean isFieldEmpty(String lastName) {
		return lastName == null || lastName.trim().length() == 0;
	}

	public static String validateMiddleName(String middleName) {
		String error = "";
		if (isFieldEmpty(middleName)) {
			error += "Midlle Name cannot be blank<br>";
		}
		return error;
	}

	public static String validateFirstName(String firstName) {
		String error = "";
		if (isFieldEmpty(firstName)) {
			error += "First Name cannot be blank<br>";
		}
		return error;
	}

	public static String validateAddress(String address) {
		String error = "";
		if (isFieldEmpty(address)) {
			error += "Address cannot be blank<br>";
		}
		return error;
	}

	public static String validatePhoneno(String phoneno) {
		String error = "";
		if (isFieldEmpty(phoneno)) {
			error += "Phone no cannot be blank<br>";
		}
		return error;
	}

	public static String validateBank(String bank) {
		String error = "";
		if (isFieldEmpty(bank)) {
			error += "Bank cannot be blank<br>";
		}
		return error;
	}

	public static String validateAccount(String account) {
		String error = "";
		if (isFieldEmpty(account)) {
			error += "Account no cannot be blank<br>";
		}
		return error;
	}

	public static String validateSSN(String ssn) {
		String error = "";
		if (isFieldEmpty(ssn)) {
			error += "SSN cannot be blank<br>";
		}
		return error;
	}

}
