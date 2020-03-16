
public class Maincode2 {
	public static String findRoots(int a,int b,int c)
	{
		int n=(b*b)-(4*a*c);
		if(n==0)
		return " roots are real and equal";
			else if (n<0)
				 return "roots are imaginary";
				else
				return	"roots are real and unequal";	
						
		
	}

}
