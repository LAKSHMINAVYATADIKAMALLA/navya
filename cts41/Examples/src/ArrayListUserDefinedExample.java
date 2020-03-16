import java.util.ArrayList;

class Students
{
	String htno;
	String name;
	Students(String htno,String name)
	{
		this.htno=htno;
		this.name=name;
	}
	public String toString()
	{
		return "htno="+htno+".name="+name;
	}
}
class Employee
{
	String eid;
	String name;
	public Employee(String eid,String name)
	{
		super();
		this.eid=eid;
		this.name=name;
	}
	public String toString()
	{
		return "eid="+eid+",name="+name;
	}
}
public class ArrayListUserDefinedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1=new Students("123","Praveen");
		Students s2=new Students("124","kumar");
		ArrayList ar= new ArrayList();
		ar.add(s1);
		ar.add(s2);
		System.out.println(ar);
		Employee e1=new Employee("001","kishore");
		Employee e2=new Employee("002","Mahesh");
		ar.add(e1);
		ar.add(e2);
		System.out.println(ar);


	}

}
