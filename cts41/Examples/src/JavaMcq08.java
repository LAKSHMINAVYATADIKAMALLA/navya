import java.util.Scanner;

public class JavaMcq08 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(s);
			s=s+2;
			if(i%2!=0&&i!=n)
			System.out.print("+");
			else if(i%2==0 && i!=n)
				System.out.print("-");
		}
	}
}

