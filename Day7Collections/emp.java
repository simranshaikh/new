package Day7Collections;

public class emp {
	
	private String name;
	private int empid;
	private int salary;
	public emp(String name, int empid, int salary) {
		super();
		
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override//this method belongs to object class
	public String toString() {
		return "emp name=" + name + "\n empid=" + empid + "\n salary=" + salary
				+ "";
	}

}
