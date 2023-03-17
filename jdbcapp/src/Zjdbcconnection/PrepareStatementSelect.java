package Zjdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PrepareStatementSelect {
	static String select="select *from jdbcdetails";
	
	
	public static void main(String[] args) {
		List<Jdbcemp> j=new ArrayList<>();
	try (
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","deep123");){
		PreparedStatement ps=con.prepareStatement(select);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Jdbcemp jd=new Jdbcemp();
			jd.setId(rs.getInt(1));
			jd.setEmp_name(rs.getString(2));
			jd.setEmp_Address(rs.getString(3));
			jd.setCity(rs.getString(4));
			jd.setDesignation(rs.getString(5));
			jd.setSalary(rs.getDouble(6));
			j.add(jd);	
		}

		for (Jdbcemp jdbcemp : j) {
			System.out.println(jdbcemp);
		}
		con.close();
		ps.close();
		rs.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
}

