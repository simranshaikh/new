package Day7Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortDemo {

	public static void main(String[] args) {
		Student4 i=new Student4(101,"shruti");
		Student4 j=new Student4(103,"ravi");
		Student4 k=new Student4(102,"adi");
		ArrayList<Student4> nm=new ArrayList<Student4>(5);
		nm.add(i);
		nm.add(j);
		nm.add(k);
		System.out.println(nm);
		Collections.sort(nm);
		System.out.println(nm);
		
	}

	

}
