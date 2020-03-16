import java.util.Scanner;
public class main6 {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter array1 size");
		int n1=scanner.nextInt();
		int [] arr1=new int[n1];
		for(int i=0;i<n1;i++)
		arr1[i]=scanner.nextInt();
		System.out.println("enter array2 size");
		int n2=scanner.nextInt();
		int [] arr2=new int[n2];
		for(int i=0;i<n2;i++)
			arr2[i]=scanner.nextInt();
		System.out.println(mainCode6.addCommon( arr1,n1,n2,arr2));
	}
	

}
