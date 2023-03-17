package callableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.connection.Connectionutil;

public class CallablleStatement {
	public static void main(String[] args) throws SQLException {

		Connection connection = Connectionutil.getConnection(); 
		CallableStatement cb = connection.prepareCall("{call companydb.customer_insert(?,?,?)}");
		cb.setInt(1, 300);
		cb.setString(2, "pradeep");
		cb.setString(3, "ramagundam");
		// cb.registerOutParameter(0, 0);

		int res = cb.executeUpdate();
		System.out.println(res);

	}

}
