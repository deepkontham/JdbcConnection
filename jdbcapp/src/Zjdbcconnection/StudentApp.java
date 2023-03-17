package Zjdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentApp {

	
	static Connection con=null;
	static Statement stmt=null;
	static ResultSet re=null;
	static{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/institute", "root" ,"deep123" );
			stmt=con.createStatement();
			re=stmt.executeQuery("select *from createiqinfo");
			
			while(re.next()) {
				System.out.println(re.getInt(1)+" "+re.getString(2)+" "+re.getString(3));
				
			}
		
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		finally {

			try {
				con.close();
				stmt.close();
				re.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		
	}
	public static void main(String[] args) {
		
		
	}
}
