package Day7Collections;

import java.util.Scanner;

public class prob1main {

	public static void main(String[] args) {
		
	prob1 r=new prob1();
	Scanner sc=new Scanner(System.in);
		r.setNames();
		System.out.println("Enter the name to search");
		String p=sc.next();
		r.searchNames(p);
		System.out.println("Enter the index number");
		int o=sc.nextInt();
		if (o>=0)
			r.searchNames(o);
		else
		{
			System.out.println("invalid index");
		}
		r.printNames();
		System.out.println("Enter the name to remove");
		String l=sc.next();
		r.Removenames(l);
		System.out.println(r);
	}


}


