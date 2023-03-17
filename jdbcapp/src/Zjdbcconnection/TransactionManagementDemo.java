package Zjdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

import com.connection.Connectionutil;

public class TransactionManagementDemo {
	
		static Connection con=null;
	    static PreparedStatement psUpdate = null;
		static PreparedStatement psInsert = null;
		 private static String Insert_Query="insert into createiqinfo values(?,?,?,?,?,?,?)";
		// private static String delete_Query="delete into createiqinfo values(?,?,?,?,?)";
		 private static String update_Query="update createiqinfo set studentname=?,Address=?,city=?,age=?,dob=?,fees=? where id=?";
		 
		 public static void main(String[] args) {
			 Student s1=new Student(5, "srikanth", "hno:2-2-9/5,Rdm","karimnagar", "29","1993-03-10",23000.00);
			 Student s2=new Student(6, "sai", "hno:2-9,mncl","hyd", "23","1996-09-12",22000.00);

             try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/institute","root","deep123");
				psInsert=con.prepareStatement(Insert_Query);
				psUpdate=con.prepareStatement(update_Query);
				con.setAutoCommit(false);
				psInsert.setInt(1, s1.getId());
				psInsert.setString(2,s1.getStudentname() );
				psInsert.setString(3, s1.getAddress());
				psInsert.setString(4, s1.getCity()) ;
				psInsert.setString(5, s1.getAge());
				psInsert.setString(6, s1.getDob());
				psInsert.setDouble(7, s1.getFees());
				psInsert.addBatch();
				
				
				psUpdate.setString(1,s2.getStudentname() );
				psUpdate.setString(2, s2.getAddress());
				psUpdate.setString(3, s2.getCity()) ;
				psUpdate.setString(4, s2.getAge());
				psUpdate.setString(5, s2.getDob());
				psUpdate.setDouble(6, s2.getFees());
				psUpdate.setInt(7, s2.getId());
				psUpdate.addBatch();
				
				int []rslt=psUpdate.executeBatch();
				int []results=psInsert.executeBatch();
				System.out.println(Arrays.toString(results));
				System.out.println(Arrays.toString(rslt));

				con.commit();
				
				} catch (SQLException sq) {
                   try {
					con.rollback();
					System.err.println(sq.getErrorCode());
					System.out.println(sq.getSQLState());
					System.out.println("rollback");
					sq.printStackTrace();

				} catch (SQLException e1) {
					
//					e1.printStackTrace();
				}
                   
			}finally {
				try {
				if(con!=null) {
						con.close(); 
				}
						if(psInsert!=null) {
							psInsert.close();
						}
						if(psUpdate!=null) {
							psUpdate.close();
						}
					} catch (SQLException e) {
						
						e.printStackTrace();
					}
					
				}
				
			}
             
			
		}

		
	


