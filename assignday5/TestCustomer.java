package assignday5;

import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer no:");
		String c=sc.next();
		System.out.println("Enter Customer name:");
		String f=sc.next();
		System.out.println("Enter Category:");
		String w=sc.next();
		
		
		try 
		{
			Customer d=new Customer(c,f,w);
		System.out.println(d);
		} 
		catch (InvalidInputException e) 
		{
			
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
