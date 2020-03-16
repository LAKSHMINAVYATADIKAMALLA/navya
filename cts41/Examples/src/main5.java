import java.util.Scanner;

public class main5
{
	public static void main(String [] args) 
	{
		Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter number of element");  
		     int n = scanner.nextInt();  
			 System.out.println("enter array");  
			 int array[]=new int[10];
		     for(int i=0;i<n;i++)
		     {
		    	 array[i]=scanner.nextInt();
		     }
		     System.out.println("enter search element");
		     int element=scanner.nextInt();
		     System.out.println(MainCose5.findElements(array, element));
	}

}



