package SurpriseTest;

import java.util.Scanner;

public class Professor {
private String name;
private Student student;
Scanner sc=new Scanner(System.in);
void teaches(Course course)
{
	System.out.println(name+"is teaching"+course.getName()+" to"+student.getName());
	//professor teaches that course
}
void conductingExam(Exam exam)
{
	System.out.println(name+" is conducting  "+exam.getName()+"exam to"+student.getName());
	//professor is conducting exam
}
int evaluatingPaper(Exam exam)
{
	System.out.println("Marks obtained in exam "+exam.getName());
	int j=sc.nextInt();
	exam.setMarks(j);
	return j;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;

}

}
