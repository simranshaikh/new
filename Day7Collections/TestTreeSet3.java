package Day7Collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TestTreeSet3 {

	public static void main(String[] args) {
	TreeSet <String> Product=new TreeSet<String>();
	
	Product.add("SOAPS");
	Product.add("RICE");
	Product.add("SALT");
	Product.add("DEO");
	Iterator<String> i=  Product.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	System.out.println("First element is:");
	System.out.println(Product.first());
	System.out.println("last element is:");
	System.out.println(Product.last());
	System.out.println("Size of TreeSet is:");
	System.out.println(Product.size());
	System.out.println("Enter the Name of element to remove:");
	Scanner sc=new Scanner(System.in);
	String j=sc.next();
	Product.remove(j);
	System.out.println("Size of TreeSet is:");
	System.out.println(Product.size());
	
	
	//System.out.println(Product);
	}

}
