import java.util.Scanner;

public class JavaMcq02
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int sumO=0;
		while(n!=0)
		{
			int r=n%10;
			if(r%2!=0)
				sumO+=r;
			n/=10;
		}
		System.out.println("Sum Og digits in the given number: "+sumO);
		
	}
	
}

