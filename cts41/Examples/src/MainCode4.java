
public class MainCode4 {
 public static int findElement(int []array,int element)
 {
	 boolean found=false;
	 for(int n=0;n<=array.length;n++)
	 {
		if(array[n]==element)
		{
			found=true;
			break;
		}
	 }
	 if(found)
		 return 1;
	 else
		 return 0;
 }
 
 
}
