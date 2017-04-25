package Day4assign;

public class Employees {
int Empid;	
String Empname;
String department;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Empid;
	result = prime * result + ((Empname == null) ? 0 : Empname.hashCode());
	result = prime * result
			+ ((department == null) ? 0 : department.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employees other = (Employees) obj;
	if (Empid != other.Empid)
		return false;
	if (Empname == null) {
		if (other.Empname != null)
			return false;
	} else if (!Empname.equals(other.Empname))
		return false;
	if (department == null) {
		if (other.department != null)
			return false;
	} else if (!department.equals(other.department))
		return false;
	return true;




}
public Employees(int empid, String empname, String department) {
	super();
	Empid = empid;
	Empname = empname;
	this.department = department;
}


}
