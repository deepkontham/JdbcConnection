package queries;

public interface MysqlQueries {
	static String INSERT_QUERY = "insert into studentinfo values(?,?,?,?,?,?)";
	static String UPDATE_QUERY = "update studentinfo set f_name=?,l_name=?,scl_name=?,Address=?,fees=? where id=?";
	static String DELETE_QUERY = "delete  studentinfo where id=?";
	static String RETRIVE_QUERY = "select *from studentinfo";


} 
