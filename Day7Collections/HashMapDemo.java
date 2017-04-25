package Day7Collections;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String >();
		hm.put(2007, "Sarvesh");
		hm.put(2008, "Shubham");
		hm.put(1999, "Anil");
		hm.put(2045,"Kriti");
		System.out.println(hm);
		
/*Enumeration e=(Enumeration) h;
while(e.hasMoreElements())
	System.out.println(e.nextElement());*/
	}

	
}

