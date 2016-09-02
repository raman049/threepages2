package main.java.com.source.servlet.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import main.java.com.source.servlet.VO.InformationVO;

public class DAO {

	public static Connection getConnection() throws Exception {
		Connection dbConn = null;
		try {
			// step1:
			Class.forName("com.mysql.jdbc.Driver");
			// step2
			String url = "jdbc:mysql://localhost:3306/test";
			// step3
			dbConn = DriverManager.getConnection(url, "root", "");
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			throw sqle;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return dbConn;
	}

	public static String personalInfoa(InformationVO informationVO)
			throws Exception {
		System.out.println("DAOImpl pInfo: process start");

		Connection dbConn = null;
		PreparedStatement pStmt = null;
		int rowsUpdated = 0;

		try {
			dbConn = getConnection();
			pStmt = dbConn
					.prepareStatement("INSERT INTO personalinfo VALUES( ?, ?, ?, ?);");

			pStmt.setString(1, informationVO.getFirstName());
			pStmt.setString(2, informationVO.getLastName());
			pStmt.setString(3, informationVO.getMiddleName());
			pStmt.setString(4, informationVO.getGender());

			rowsUpdated = pStmt.executeUpdate();

			if (rowsUpdated != 1) {
				throw new Exception("Error in updating the row");

			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			throw sqle;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			pStmt.close();
			dbConn.close();
		}
		System.out.println("DAOImpl pInfo: process end");
		return null;
	}
	
	public static String contactInfo(InformationVO informationVO)
			throws Exception {
		System.out.println("DAOImpl cInfo: process start");
		Connection dbConn = null;
		PreparedStatement pStmt = null;
		int rowsUpdated = 0;

		try {
			dbConn = getConnection();
			pStmt = dbConn
					.prepareStatement("INSERT INTO contactinfo VALUES( ?, ?, ?, ?,?);");

			pStmt.setString(1, informationVO.getAddress());
			pStmt.setString(2, informationVO.getCity());
			pStmt.setString(3, informationVO.getState());
			pStmt.setString(4, informationVO.getCountry());
			pStmt.setString(5, informationVO.getPhone());

			rowsUpdated = pStmt.executeUpdate();

			if (rowsUpdated != 1) {
				throw new Exception("Error in updating the row");

			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			throw sqle;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			pStmt.close();
			dbConn.close();
		}
		System.out.println("DAOImpl cInfo: process end");
		return null;
	}
	public static String bankInfo(InformationVO informationVO)
			throws Exception {
		System.out.println("DAOImpl bInfo: process start");
		Connection dbConn = null;
		PreparedStatement pStmt = null;
		int rowsUpdated = 0;

		try {
			dbConn = getConnection();
			pStmt = dbConn
					.prepareStatement("INSERT INTO bankinfo VALUES( ?, ?, ?);");

			pStmt.setString(1, informationVO.getBank());
			pStmt.setString(2, informationVO.getAccount());
			pStmt.setString(3, informationVO.getSsn());

			rowsUpdated = pStmt.executeUpdate();

			if (rowsUpdated != 1) {
				throw new Exception("Error in updating the row");

			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			throw sqle;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			pStmt.close();
			dbConn.close();
		}
		System.out.println("DAOImpl bInfo: process end");
		return null;
	}
}
