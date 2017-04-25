package ExceptionHandling;

import java.util.Scanner;

public class Clinic {

	public static void main(String[] args) {
	Doctor d=new Doctor();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Doctor's degree");
	try {
		d.setDegree(sc.useDelimiter("\n").next());
	}
	
	catch (DoctorException e) {
		System.out.println("Enter valid degree");
	}
	System.out.println("Enter Doctor's name:");
	d.setName(sc.next());
	}

}
