package SurpriseTest;

import java.util.Scanner;

public class University {
static int count;
private static Professor professor;
Scanner sc=new Scanner(System.in);
Exam exam;
static Course course;
boolean studentVerificationProcess(Student student)
{
	if (Validator.validateStudent(student))
	System.out.println("student is valid");
	return true;
}
void writeExamGetResult(Exam exam)
{
	if (exam.getMarks()>80)
		System.out.println("you are"+exam.getName()+"certified");
	else
		System.out.println("sorry you are failed");
}
void studentAdmission(Student student,Course course)
{
	System.out.println(student.getName()+" registered for"+course.getName());
}
void StudentCertification(Student student,Course course)
{
	System.out.println(student.getName()+"curriculum for"+course.getName()+"starts");
	
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Student s=new Student();
		System.out.println("---------Enter student name-----------");
	String Sname=sc.next();
	s.setName(Sname);
	System.out.println("---------Enter student age-----------");
	int Sage=sc.nextInt();
	s.setAge(Sage);
	System.out.println("---------Enter student marks-----------");
	int Smarks=sc.nextInt();
	s.setPreviousMarks(Smarks);
	
	System.out.println("---------Enter course id-----------");
	int Cid=sc.nextInt();
	System.out.println("---------Enter course name-----------");
	String Cname=sc.next();
	
	System.out.println("---------Enter course duration-----------");
	int Cdura=sc.nextInt();
	Course c=new Course(Cid,Cname,Cdura);
	System.out.println("student"+s.getName()+"applied for university");
	System.out.println("---------Enter professor name-----------");
	
	Professor p=new Professor();
	String Pname=sc.next();
	p.setName(Pname);
	p.setStudent(s);
		if (Registrar.registerStudent(s))
	{
	System.out.println("Register has sent your details to Validator......Please Wait...");
    System.out.println("Validator validating your details"+s.getName()+"......Please Wait...");
    Validator.validateStudent(s);
    System.out.println(s.getName()+"you are registered successfully......Please Wait...");
	}
else
{
	System.out.println("Registration failed");
}
	Exam e=new Exam();
	e.setName(Cname);
	University u=new University();
	
	 if (u.studentVerificationProcess(s))
	 {
	u.studentAdmission(s,c);
	 }
	u.StudentCertification(s, c);
	p.teaches(c);
	p.conductingExam(e);
	p.evaluatingPaper(e);
	u.writeExamGetResult(e);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	







}

}
