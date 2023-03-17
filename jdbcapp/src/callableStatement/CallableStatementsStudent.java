package callableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.Connectionutil;

public class CallableStatementsStudent {
	public static void main(String[] args) throws SQLException {
	Connection Connection=Connectionutil.getConnection();
	CallableStatement cb= Connection.prepareCall("{call student_getby_id1(?) }");
	cb.setInt(1, 2);
	ResultSet rs=cb.executeQuery();
 while(rs.next()) {
	 System.out.println(rs.getInt(1)+" "+rs.getString(2));
 }
	
	
	}

}
