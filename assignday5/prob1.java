package assignday5;

import java.util.Scanner;

public class prob1 extends Exception{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
//System.out.println("Enter the no of index");
int arr[]=new int[10];
int j=1;
for(int i=0;i<=10;i++){
	try{
	arr[i]=j;
	System.out.println(arr[i]);
	}
	catch(Exception e){
		System.out.println("array is going out of limit");
	}
	
	j++;
}





}	


}
