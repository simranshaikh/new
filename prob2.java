
public class prob2 {
public static void main(String arr[])
{	int sum=0;
	float avg=0;
int i=arr.length;
	for (int j=0;j<i;j++)
	{
		
	sum=sum+Integer.parseInt(arr[j]);
	avg=(sum/i);

		}
	System.out.println(sum);	
	System.out.println(avg);
}
}
