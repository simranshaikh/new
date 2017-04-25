package assignday5;

import java.util.Scanner;

public class prob2main {

	public static void main(String[] args) {
		
prob2 d=new prob2();
Scanner sc =new Scanner(System.in);
System.out.println("Enter the dept id: ");
try {
	d.setDept(sc.next());
} catch (prob2Exception e) {
	System.out.println(e);
}

	}

}
