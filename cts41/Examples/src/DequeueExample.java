import java.util.*;
public class DequeueExample 
{
	public static void main(String[] args)
	{
		PriorityQueue d=new PriorityQueue();
		d.add(10);
		d.add(20);
		System.out.println(d);
		d.remove();
		System.out.println("after removal");
		System.out.println(d);
		d.add(9);
		System.out.println(d);
		d.remove();
		System.out.println(d);
	}
	

}
