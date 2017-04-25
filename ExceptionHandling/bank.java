package ExceptionHandling;

import java.util.Scanner;

public class bank {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try {
			Account a=new Account(sc.next(), sc.next());
		} catch (AccountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//String b=sc.next();
	/*try
	{
		a.setAccid(b);
	} 
	catch (AccountException e) 
	{
		//e.printStackTrace();
		System.out.println(e.getMessage());
	}
	
	a.setAcctype(sc.next());
	System.out.println(a);
	}*/
	}
}
