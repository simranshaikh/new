package Day7Collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(true);
	hs.add(1.23);
	hs.add("Good");
	hs.add(new emp("shashank",101,5000));
	System.out.println(hs);

	}

}
