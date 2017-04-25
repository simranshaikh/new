package Day9FileHandling;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp no");
		int Eno=sc.nextInt();
		System.out.println("Enter employee Name");
		String Name=sc.next();
		System.out.println("Enter EmpBasic");
		int Basic=sc.nextInt();
		Employees e=new Employees(Eno,Name,Basic);
		System.out.println(e);
		
		try {
			FileOutputStream fos=new FileOutputStream("Emp.txt");
			DataOutputStream dos =new DataOutputStream(fos);
			dos.writeBytes(e.toString());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
