package Day9FileHandling;



import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	File f=new File("letter.txt");
	
	try {
		
		char ch1 = '\n';
		int c = ch1;
		FileOutputStream fos=new FileOutputStream(f);
		BufferedOutputStream bis=new BufferedOutputStream(fos);
		f.createNewFile();
		String text[]=new String[5];
		System.out.println("Write 5 lines in the file");
		for(int i=0;i<=4;i++)
		{
		 text[i]=sc.nextLine();
		 byte b[]=text[i].getBytes();
		 
		 bis.write(c);
		bis.write(b);
		}
		bis.close();
	}
	catch (IOException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
