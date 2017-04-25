package Day9FileHandling;

import java.io.File;
import java.util.Scanner;

public class DirectoryList {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of Directory");
		
		String ch=sc.next();
		
		File f=new File(ch);
		
		if (f.isDirectory())
		{
			String s[]=f.list();
			int r=s.length;
		
		for (int i = 0; i < r; i++) 
		{

			System.out.println(s[i]);
		}
	}
	else
		System.out.println("Directory not exists");


}

}
