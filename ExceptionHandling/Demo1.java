package ExceptionHandling;

import java.util.Scanner;

public class Demo1 
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println("Enter the denominator");
		int den=sc.nextInt();

		try{
			float ans=num/den;
			System.out.println("Ans is:"+ans);
		}
		catch(ArithmeticException a)
		{
			System.out.println("please enter the correct denominator");
		}
	}
}
