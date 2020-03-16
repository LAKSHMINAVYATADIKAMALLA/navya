
import java.util.Scanner;

public class JavaMcq06
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sizeof array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		long sum=0;
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			sum=(long) (sum+Math.pow(arr[i], i));
			
		}
			System.out.println(sum);
		
	}
}

