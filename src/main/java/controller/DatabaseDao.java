package controller;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class DatabaseDao {
	// TODO stored procedures or transactions in code
	
	// might need this later
	// java.util.Date utilDate = new java.util.Date();
	// java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
	
	Connection conn;
	
	public void dbConnect(String db_connect_string, String db_userid, String db_password) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(db_connect_string, db_userid, db_password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void select() throws SQLException{
		PreparedStatement ps = conn.prepareStatement("select SYSDATE from dual");
		ResultSet rs = ps.executeQuery();
		
		while (rs.next())
		{
			System.out.println(rs.getString(1));
		}
		rs.close();
		ps.close();
	}
	
	public void executePreparedTransaction(HashMap<String, Integer> salesForWeek) throws SQLException {
		PreparedStatement updateSales = null;
		PreparedStatement updateTotal = null;
		String dbName = "images";

		String updateString = "update " + dbName + ".COFFEES " + "set SALES = ? where COF_NAME = ?";
		String updateStatement = "update " + dbName + ".COFFEES " + "set TOTAL = TOTAL + ? " + "where COF_NAME = ?";

		try {
			conn.setAutoCommit(false);
			updateSales = conn.prepareStatement(updateString);
			updateTotal = conn.prepareStatement(updateStatement);

			for (Map.Entry<String, Integer> e : salesForWeek.entrySet()) {
				updateSales.setInt(1, e.getValue().intValue());
				updateSales.setString(2, e.getKey());
				updateSales.executeUpdate();
				updateTotal.setInt(1, e.getValue().intValue());
				updateTotal.setString(2, e.getKey());
				updateTotal.executeUpdate();
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			if (conn != null) {
				try {
					System.err.print("Transaction is being rolled back");
					conn.rollback();
				} catch (SQLException excep) {
					excep.printStackTrace();
				}
			}
		} finally {
			if (updateSales != null) {
				updateSales.close();
			}
			if (updateTotal != null) {
				updateTotal.close();
			}
			conn.setAutoCommit(true);
		}
	}

}
