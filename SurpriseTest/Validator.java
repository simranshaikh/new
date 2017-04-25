package SurpriseTest;

public class Validator {

	public static boolean validateStudent(Student s)
	
	{
		if (s.getPreviousMarks()<60)
			return false;
		else
			return true;
			
		
	}
}
