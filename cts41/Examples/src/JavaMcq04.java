import java.util.Scanner;

public class JavaMcq04
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String str="";
		int n=sc.nextInt();
		int l=s.length();
		for(int i=0;i<n;i++)
			str+=s.charAt(i);
		for(int i=l-n;i<l;i++)
			str+=s.charAt(i);
		System.out.println(str);
	}
}
