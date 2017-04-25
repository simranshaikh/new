package Day7Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class prob1 {
 Scanner sc=new Scanner(System.in);
	private ArrayList <String> names=new ArrayList<String>(1000);
 public void setNames()
 {
	System.out.println("Enter the number of students");
	int e=sc.nextInt();
	 for (int i = 0; i < e; i++)
	 {    System.out.println("Enter the name of Student");
		 String nm=sc.next();
		 names.add(nm);
		}
 }
	 public void searchNames(String nm)
	 {
	if	(names.contains(nm))
	{
	System.out.println("name is found");
	}
	else
		System.out.println("Name is not found");
	}
public void searchNames(int n){
	String s=names.get(n);
	System.out.println(s);
	if (s.equals(null))
	{
	System.out.println("name is not found");
	}
	}
public void printNames()
{
System.out.println(names.iterator());	
}

public void Removenames(String nm)
{
	names.remove(nm);
	System.out.println("name is deleted");
}


}
