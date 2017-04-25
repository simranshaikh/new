package Day7Collections;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Student {
	 Scanner sc=new Scanner(System.in);
	private HashMap<String,String> empNames=new HashMap<String,String>();
	public void setNames()
	
	{
		System.out.println("Enter the number of employees");
		int e=sc.nextInt();
		 for (int i = 0; i < e; i++)
		 {   System.out.println("Enter the rollno of employee");
		 String rnm=sc.next();
		 System.out.println("Enter the name of employee");
		 String nm=sc.next();
		  empNames.put(rnm, nm);
			}	
	}
	
	public void PrintNames()
{
		Iterator i= empNames.entrySet().iterator(); 
		while(i.hasNext())
		{
			Map.Entry m =(Map.Entry) i.next();
			System.out.println(" "+m.getKey()+ " "+m.getValue());
		}
}

	public void getNames(String nm)
	{
		
		String t=empNames.get(nm);
		System.out.println(t);
	}
public void PrintNamesKeysets()
{
	for(String key:empNames.keySet())
	{
		if(empNames.containsKey(key))
		{
			System.out.println(empNames.get(key));
		}
	}
	

}
public void Printsize(){
	System.out.println(empNames.size());
}
public void RemoveName(String rm)
{
	empNames.remove(rm);
	System.out.println(empNames);
}

}
