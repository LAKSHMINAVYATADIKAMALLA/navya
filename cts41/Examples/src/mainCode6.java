
public class mainCode6 
{
	public static int addCommon(int [] arr1,int n1,int n2 ,int [] arr2)
	{
		int sum=0;
	
		 for(int i=0;i<=n1;i++)
		 {
			 for(int j=0;j<=n2;j++)
			 {
				 if(arr1[i]==arr2[j])
					 sum+=arr1[i];
			 }
		 }
		 return sum;
	}
}
