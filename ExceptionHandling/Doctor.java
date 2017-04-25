package ExceptionHandling;

import java.util.Scanner;

public class Doctor 
{
	Scanner sc=new Scanner(System.in);	
	private String degree;
	private String name;


	public void setDegree(String degree1) throws DoctorException {
		if(degree1.length()>0||degree1.isEmpty()||degree1.equals(null))
		throw new DoctorException();
		else
		this.degree = degree1;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void putData() {
		System.out.println("Degree is"+ " " +this.degree+" "+"name of the doctor is"+" "+this.name);
	}

}
