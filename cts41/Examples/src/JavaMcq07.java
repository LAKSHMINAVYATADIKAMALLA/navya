import java.util.Scanner;

public class JavaMcq07
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int max=-10000,min=457572;
		if(n==1)
			System.out.println(arr[0]);
		else
		{
			for(int i=0;i<n;i++)
			{
				if(arr[i]<min)
					min=arr[i];
				if(arr[i]>max)
					max=arr[i];
			}
			
		
		System.out.println(max-min);
		}	
	}
}

