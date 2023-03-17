package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.connection.Connectionutil;

import Zjdbcconnection.Jdbcemp;
import model.Student;
import queries.MysqlQueries;

public class Studentimpl implements StudentDao {
	private static Connection connection = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;
	@Override
	public Student save(Student student) {
		try {
		connection = Connectionutil.getConnection();
		ps = connection.prepareStatement(MysqlQueries.INSERT_QUERY);
		ps.setInt(1, student.getId());
		ps.setString(2, student.getF_name());
		ps.setString(3, student.getL_name());
		ps.setString(4, student.getScl_name());
		ps.setString(5, student.getAddress());
		ps.setDouble(6, student.getFees());


		int result = ps.executeUpdate();
		System.out.println("inserted " + result + " row");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//Connectionutil.closeConnection(connection, ps);
		}
		return student;


	}

	@Override
	public Student update(Student student) {

		try {
			connection = Connectionutil.getConnection();
			ps=connection.prepareStatement(MysqlQueries.UPDATE_QUERY);


			ps.setString(1,student.getF_name());
			ps.setString(2,student.getL_name());
			ps.setString(3,student.getScl_name());
			ps.setString(4,student.getAddress());
			ps.setDouble(5,student.getFees());
			ps.setInt(6,student.getId());
			
			int result = ps.executeUpdate();
			System.out.println("updated " + result + " row");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				Connectionutil.closeConnection(connection, ps);
			}
			return student;
			
			
	}

	@Override
	public  List<Student> getAllStudent() {
		List<Student> j=new ArrayList<>();

		try {
			connection=Connectionutil.getConnection();
			ps=connection.prepareStatement(MysqlQueries.RETRIVE_QUERY);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
			Student s=new Student();
			s.setId(rs.getInt(1));
			s.setF_name(rs.getString(2));
			s.setL_name(rs.getString(3));
			s.setScl_name(rs.getString(4));
		    s.setAddress(rs.getString(5));
			s.setFees(rs.getDouble(6));
			j.add(s);
			}
			for( Student sr :j) {
				System.out.println(sr);
				
			}
			//return j ;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		 finally {
				Connectionutil.closeConnection(connection, ps);
			}
		return j;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Student getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
