package Day9FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PizzaHut {

	public static void main(String[] args) {
		Pizza p=new Pizza("Delux margaritta",5);

		//1.serialization-FOS,OOS

		try {
			FileOutputStream fos=new FileOutputStream("pizzainfo.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(p);
			fos.close();
			oos.close();
			
			//2.DeSerialization
			FileInputStream fis=new FileInputStream("pizzainfo.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Pizza p1=(Pizza) ois.readObject();
			System.out.println(p1);
			fis.close();
			ois.close();
		}
		catch (FileNotFoundException e) 
		{

			e.printStackTrace();
		} catch (IOException e)
		{

			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}

	}

}
