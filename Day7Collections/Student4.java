package Day7Collections;

public  class Student4 implements Comparable
{
	private int rollNo;
	private String name;

	public Student4(int rollNo, String name) 
	{
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student4 [rollNo=" + rollNo + ", name=" + name + "]";
	}


	public int compareTo(Object o)
	{
		Student4 s=(Student4) o;
		int var=this.rollNo;
		if(var<0)
			return -1;
		else
			if(var>0)
		return 1;
			else
				return 0;
		
	}

}
