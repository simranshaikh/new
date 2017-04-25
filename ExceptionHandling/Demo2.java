package ExceptionHandling;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4];
		arr[0]=1; arr[1]=2; arr[2]=3; arr[3]=4;
		try
		{
			System.out.println("Enter the index:");
			int idx=sc.nextInt();
			System.out.println("Character at entered index is: "+arr[idx]);

			String str="Ganesh";
			System.out.println("Enter the index:");
			idx=sc.nextInt();
			System.out.println("Chracter at that index is: "+str.charAt(idx));
		}

		catch(StringIndexOutOfBoundsException a2)
		{
			System.out.println("For String:please enter the index from range 0..5");
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("For array:please enter the index from range 1..3");
		}

catch (Exception e)
		{
		System.out.println("anonymous exception occured");
		}


	}
}
