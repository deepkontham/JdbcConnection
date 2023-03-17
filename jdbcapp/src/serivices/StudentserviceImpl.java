package serivices;

import java.util.List;

import dao.Studentimpl;
import model.Student;

public class StudentserviceImpl implements StudentService {


	private Studentimpl dao = new Studentimpl();

	public Student save(Student student) {
		return dao.save(student);
	}

	@Override
	public Student update(Student student) {
		return dao.update(student);
	}

	@Override
	public List<Student> getAllStudent() {
		return dao.getAllStudent();
	}

	@Override
	public int delete(int id) {
		return dao.delete(id);
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

	
