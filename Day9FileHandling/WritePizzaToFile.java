package Day9FileHandling;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritePizzaToFile 
{
	public static void main(String[] args)
	{
		//1.Create Object
		Pizza p=new Pizza("Delux Margaritta",5);
		//2.Write anObject into the File-FOS,DOS
		try 
		{
			FileOutputStream fos=new FileOutputStream("pizza.txt");
			DataOutputStream dos =new DataOutputStream(fos);
			dos.writeBytes(p.toString());
			} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}

}
