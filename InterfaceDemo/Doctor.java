package InterfaceDemo;

import java.util.Scanner;

public class Doctor implements Myinterface
{
	Scanner sc=new Scanner(System.in);	
	private String degree;
	private String name;
	public void getData(){

		System.out.println("enter the degree of doctor");	
		this.degree=sc.next();
		System.out.println("Enter the doctor's name");
		this.name=sc.next();	
	}
	@Override
	public void putData() {
		System.out.println("Degree is"+ " " +this.degree+" "+"name of the doctor is"+" "+this.name);
	}

}
