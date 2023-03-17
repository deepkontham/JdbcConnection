package Zjdbcconnection;

public class Jdbcemp {
	private int id;
	private String emp_name;
	private String emp_Address;
	private String city;
    private String designation;
    private double salary;
    
    
    
	public Jdbcemp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jdbcemp(int id, String emp_name, String emp_Address, String city, String designation, double salary) {
		this.id = id;
		this.emp_name = emp_name;
		this.emp_Address = emp_Address;
		this.city = city;
		this.designation = designation;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_Address() {
		return emp_Address;
	}

	public void setEmp_Address(String emp_Address) {
		this.emp_Address = emp_Address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Jdbcemp [id=" + id + ", emp_name=" + emp_name + ", emp_Address=" + emp_Address + ", city=" + city
				+ ", designation=" + designation + ", salary=" + salary + "]";
	}

	
   
    
	
	
	

}
