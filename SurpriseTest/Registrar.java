package SurpriseTest;

public class Registrar {
	public static boolean registerStudent(Student s)
	
	{  
		if (s.getName().equals(null) &&s.getPreviousMarks()<0)
		return false;
		else
			return true;
		
	}

}
