package Zjdbcconnection;

public class Student {

private int id;
private String Studentname;
private String Address;
private String city;
private String age;
private String dob;
private double fees;

public Student(int id, String Studentname, String Address, String city,String age, String dob, double fees) {
	super();
	this.id = id;
	this.Studentname = Studentname;
	this.Address = Address;
	this.city = city;
	this.age=age;
	this.dob = dob;
	this.fees = fees;
}

public int getId() {
	return id;
}

public String getStudentname() {
	return Studentname;
}

public String getAddress() {
	return Address;
}

public String getCity() {
	return city;
}

public String getDob() {
	return dob;
}


public String getAge() {
	return age;
}

public double getFees() {
	return fees;
}



}
