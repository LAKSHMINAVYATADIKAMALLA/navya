
public class MainCode3 {
	public static boolean primeNum(int n)
	{
		boolean flag=true;
		for(int x=2;x<=n/2;x++)
		{
			if(n%x==0)
				flag=false;
		}
		return flag;
	}

}
