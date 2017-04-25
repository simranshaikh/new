package Day7Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(10.5);
	a.add('A');
	a.add(true);
	a.add("God");
	a.add(new emp("shashank",101,5000));
	System.out.println(a.size());
	System.out.println(a.remove("God"));
	System.out.println(a);
	System.out.println(a.subList(0, 4));
	System.out.println(a.iterator());




}
}
