package model;

public class Student {
 private int id;
 private String f_name;
private String l_name;
private String  scl_name;
private String Address;
private double fees;


public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(int id, String f_name, String l_name, String scl_name, String address, double fees) {
	super();
	this.id = id;
	this.f_name = f_name;
	this.l_name = l_name;
	this.scl_name = scl_name;
	Address = address;
	this.fees = fees;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getF_name() {
	return f_name;
}

public void setF_name(String f_name) {
	this.f_name = f_name;
}

public String getL_name() {
	return l_name;
}

public void setL_name(String l_name) {
	this.l_name = l_name;
}

public String getScl_name() {
	return scl_name;
}

public void setScl_name(String scl_name) {
	this.scl_name = scl_name;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}

public double getFees() {
	return fees;
}

public void setFees(double fees) {
	this.fees = fees;
}

@Override
public String toString() {
	return "Student [id=" + id + ", f_name=" + f_name + ", l_name=" + l_name + ", scl_name=" + scl_name + ", Address="
			+ Address + ", fees=" + fees + "]";
}




}
