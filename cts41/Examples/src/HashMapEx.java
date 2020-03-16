import java.util.*;
import java.util.Scanner;
class cgroups
{
	String d1;
	String d2;
	String d3;

public cgroups(String d1,String d2,String d3)
{
	super();
	this.d1=d1;
	this.d2=d1;
	this.d3=d3;
	
}
}

public class HashMapEx
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Map<String,cgroups>map=new HashMap<String,cgroups>();
		map.put("jntu", new cgroups("cse","ece","eee"));
		map.put("slv", new cgroups("cse","civil","mec"));
		map.put("ou",new cgroups("it","ece","civil"));
		Scanner sc=new Scanner(System.in);
		System.out.println("the courses to search:");
		String course=sc.next();
		Set keys=map.entrySet();
		Iterator itr1=keys.iterator();
		while(itr1.hasNext())
		{
			Map.Entry me=(Map.Entry)itr1.next();
			cgroups i=(cgroups)me.getValue();
			if(i.d1.equals(course)||(i.d2.equals(course))||(i.d3.equals(course)))
					{
						System.out.println(me.getKey());
					}
		}
		

	}

}
