import java.util.ArrayList;
import java.util.function.*;
class TempEmp
{
	String name;
	double salary;
	TempEmp(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
}
public class BiFunctionInterface 
{
	 

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<TempEmp> l=new ArrayList<TempEmp>();
		l.add(new TempEmp("durga",1000));
		l.add(new TempEmp("sunny",2000));
		BiConsumer<TempEmp,Double>c=(e,d)->e.salary=e.salary+d;
		for(TempEmp e:l)
		{
			c.accept(e, 500.0);
		}
		for (TempEmp e:l)
		{
			System.out.println("Employe Name:"+e.name);
			System.out.println("Employee salary:"+e.salary);
			System.out.println();
		}

	}

}
