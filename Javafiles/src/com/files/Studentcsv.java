package com.files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class Studentcsv {
	public static void main(String[] args) throws IOException {
		
		List<Student> l=new ArrayList<>();
		l.add(new Student(1,"mahesh"));
		l.add(new Student(2,"mahesh"));
		l.add(new Student(3,"mahesh"));
		l.add(new Student(4,"pradeep"));
		
		CSVWriter csv=new CSVWriter(new FileWriter("mahesh.csv"));
		for (Student student : l) {
			String []s= {String.valueOf(student.getId()),student.getName()};
			csv.writeNext(s);
		}

		csv.flush();
		csv.close();
		System.out.println("success");
	}
	 

}
