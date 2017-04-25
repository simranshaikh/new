package Day7Collections;

import java.util.Scanner;
import java.util.Set;

public class Studentmain {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
Student s=new Student();
s.setNames();
s.PrintNamesKeysets();
s.PrintNames();

System.out.println("Enter the roll no");
String r=sc.next();
s.getNames(r);
System.out.println("Enter the key");
String w=sc.next();
s.RemoveName(w);
System.out.println(s);
	}

}
