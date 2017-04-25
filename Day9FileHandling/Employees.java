package Day9FileHandling;

public class Employees {
	private int empNo;
	private String empName;
	private int empBasic;
	
	public Employees(int empNo, String empName, int empBasic) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empBasic = empBasic;
	}

	public int getEmpNo() {
		return empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpBasic() {
		return empBasic;
	}

	@Override
	public String toString() {
		return "Employees [empNo=" + empNo + ", empName=" + empName
				+ ", empBasic=" + empBasic + "]";
	}


}
