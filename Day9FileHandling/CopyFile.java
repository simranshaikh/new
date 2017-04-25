package Day9FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {

	public static void main(String[] args) {
		
		
		try {
			File f=new File("source.txt");
			f.list();
			File f1=new File("Destination17.txt");
		if (f.exists())
		{
			if (f1.exists())
			{
				FileReader fr=new FileReader("source.txt");
				FileWriter fw= new FileWriter("Destination15.txt");

				System.out.println("Do you want to OverWrite the Existing File(y/n)?");

				Scanner sc=new Scanner(System.in);
				String h=sc.next();
				if (h.equals("y"))
				{

					int ch;
					while((ch=fr.read())!=-1)
					{

						fw.write((char)ch);

					}
					System.out.println("File writing Completed");
					fw.close();
					fr.close();
				}
				else
				{
					System.out.println("File is not Overwritten");
				}
			}
			else
			{
				if(f1.createNewFile())
				{
					FileReader fr=new FileReader("source.txt");
					FileWriter t=new FileWriter("Destination17.txt");
					int ch;
					while((ch=fr.read())!=-1)
					{
						t.write(ch);
						
					}
					System.out.println("File writing Completed");
					t.close();
					fr.close();
				}
			}
		}
		else
		{
			System.out.println("Source file does not exists");
		}




	} catch (IOException e) {
	
		e.printStackTrace();
	}

}

}
