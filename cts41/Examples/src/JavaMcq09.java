import java.util.Scanner;
public class JavaMcq09 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] ch=new char[s.length()];
		ch=s.toCharArray();
		int sum=0,z=0;
		for(int i=0;i<s.length();i++)
		{
			
			if(ch[i]>=48 && ch[i]<=57)
			{
				z=Integer.parseInt(Character.toString(ch[i]));
			
				sum=sum+z;
			}
				
			
		}
		System.out.println(sum);
	}
}

