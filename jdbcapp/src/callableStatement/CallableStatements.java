package callableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import com.connection.Connectionutil;

public class CallableStatements {
	public static void main(String[] args) throws SQLException {
		Connection connection = Connectionutil.getConnection();
		CallableStatement cb = connection.prepareCall("{call addition_two_numbers(?,?,?)}");
		cb.setInt(1, 100);
		cb.setInt(2, 200);
		cb.registerOutParameter(3, Types.INTEGER);
		cb.executeQuery();
		int res = cb.getInt(3);
		System.out.println(res);
		Connectionutil.closeConnection(connection, cb);

	}

}
