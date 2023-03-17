package client;

import java.util.ArrayList;
import java.util.List;

import model.Student;
import serivices.StudentserviceImpl;

public class StudentApp {
	public static void main(String[] args) {
		StudentserviceImpl service = new StudentserviceImpl();

//		Student student1 = new Student(9, "goutham", "narla", "vbhs", "hno:83-33",2221.000);
//		Student student3 = new Student(10, "sai", "narla", "vbhs", "hno:83-33",2221.000);
//		Student student4 = new Student(11, "jithu", "narla", "vbhs", "hno:83-33",2221.000);

       List<Student> s=new ArrayList<>();
       s.add(new Student(8, "balaji", "kola", "vbhs", "hno:2-29",2222.000));
       s.add(new Student(9, "goutham", "narla", "vbhs", "hno:83-33",2221.000));
       s.add(new Student(10, "sai", "narla", "vbhs", "hno:83-33",2221.000));
       s.add(new Student(11, "jithu", "narla", "vbhs", "hno:83-33",2221.000));
       
       for (Student student : s) {
    	   service.save(student);
		
	}
		
	//service.save(student3);
		//service.update(student4)
		//service.getAllStudent();
		
	}

	}


