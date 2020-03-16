import java.util.Scanner;

public class JavaMcq10
{
	public static void main(String args[])
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the color:");
		String str=sc.next();
		int f=1;
		if(str.charAt(0)=='#')
		{
			if(str.length()==7)
			{
				for(int i=1;i<7;i++)
				{
					if((str.charAt(i)>=65 && str.charAt(i)<=90)||str.charAt(i)>=97 && str.charAt(i)<=122)
						f=0;
					else
						f=1;
				}
				if(f==0)
					System.out.println("Valid");
				else
					System.out.println("Not Valid");
			}
			else
				System.out.println("Not Valid");
		}
		else
			System.out.println("Not Valid");
		
			
	}
}

