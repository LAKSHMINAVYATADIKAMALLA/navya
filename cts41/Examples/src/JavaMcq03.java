
import java.util.Scanner;

public class JavaMcq03
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int sumE=0;
		while(n!=0)
		{
			int r=n%10;
			if(r%2==0)
				sumE=sumE+(r*r);
			n/=10;
		}
		System.out.println("Sum Of square of even digits in the given number: "+sumE);
		
	}

}

