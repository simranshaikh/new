package Day3Assign;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Employee e=new Employee();
		System.out.println("Enter Empno");
		e.setEmpNo(sc.nextInt());
		System.out.println("Enter Empname");
		e.setEmpName(sc.next());
		System.out.println("Enter EmpBasic salary");
		e.setEmpBasic(sc.nextInt());
		System.out.println(e);
	}

}
