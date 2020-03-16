import java.util.Scanner;

public class JavaMcq01 {

	public static int countVowels(String str)
	{
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				c++;
		}
		return c;
	}
	public static boolean IsPalindrome(String str)
	{
		int i=0;
		int j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
				return false;
			i++;
			j--;
					
		}
		return true;
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int r=0;
		boolean res=IsPalindrome(str);
		if(res==true)
		{
			r=countVowels(str);
		}
		if(r>=2)
			System.out.println("PAlindrome");
		else
			System.out.println("Not PAlindrome");
	}
}

