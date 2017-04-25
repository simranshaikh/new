package assignday5;

public class prob2 {
	private String dept;

	public void setDept(String dept) throws prob2Exception  {
		if(dept.startsWith("DEPT")&&dept.length()==7)
		this.dept = dept;
		else
			throw new prob2Exception();
	}
	
}
