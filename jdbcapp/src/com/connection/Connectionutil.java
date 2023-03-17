package com.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class Connectionutil {
	
	private static Connection con=null;
	private static Properties prop=null;

	static {
		prop=new Properties();
		try {
			prop.load(Connectionutil.class.getClassLoader().getResourceAsStream("db.properties"));
			Class.forName(prop.getProperty("driver"));
            con=DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("user"),prop.getProperty("pw"));
		} catch (IOException | SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void closeConnection(Connection con) {
		try {
			if (con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

}
	public static Connection getConnection() {
		return con;
		
	}

	public static void closeConnection(Connection connection, PreparedStatement ps) {

		try {
			if (connection != null && ps != null)
				closeConnection(connection);
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
    System.out.println(getConnection());
	}
}
