package dao;

import java.util.List;

import model.Student;

public interface StudentDao {
	Student save(Student student);

	Student update(Student student);

	List<Student> getAllStudent();

	int delete(int id);

	Student getByName(String name);

	Student getById(int id);

}
	



