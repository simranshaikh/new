package Day9FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIS {

	public static void main(String[] args) {
		File f=new File("data.txt");
		try 
		{
			FileInputStream fis=new FileInputStream("data.txt");
			int ch;
			while ((ch=fis.read())!=-1)
			{
				System.out.print((char) ch);
			}
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
