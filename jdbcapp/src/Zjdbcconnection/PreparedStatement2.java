package Zjdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatement2 {
	
	private static String Update_Query="update jdbcdetails set emp_name=?,emp_Address=?,city=?,designation=?,salary=? where id=?";
	private static String delete_query="delete from jdbcdetails where id=?  ";
	public static void main(String[] args) {
		Jdbcemp jd=new Jdbcemp(4, "vamshi", "hno:3-34/8,gdk","karimnagar","automater",24333.03);

		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","deep123");
			//PreparedStatement psupdate=con.prepareStatement(Update_Query);
			PreparedStatement psdelete=con.prepareStatement(delete_query);
			
//		
//			psupdate.setString(1,jd.getEmp_name());
//			psupdate.setString(2, jd.getEmp_Address());
//			psupdate.setString(3, jd.getCity());
//			psupdate.setString(4,jd.getDesignation());
//			psupdate.setDouble(5, jd.getSalary());
//			psupdate.setInt(6, jd.getId());
//			
//			
			psdelete.setInt(1, 2);
			psdelete.executeUpdate();
		
		//	System.out.println(psupdate.executeUpdate());
		     
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
