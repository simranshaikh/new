package Day4assign;

public class emptest 
{

	public static void main(String[] args) 
	{
		Employees e1=new Employees(101,"shash","acc");
	
		Employees e2=new Employees(101,"shash","acc");
		if (e1.equals(e2))
		{
		System.out.println("objects are equal");	
		}
		else
			{
			System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
			}
			
	
	}
	
	}



