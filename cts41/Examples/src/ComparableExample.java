import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
class Studentss implements Comparable <Student>
{
	String htno;
	String name;
	Studentss(String htno,String name)
	{
		this.name=name;
		this.htno=htno;
	}
	public String tostring()
	{
		return "htno"+htno+",name="+name;
		
	}
	public int compareTo(Studentss student)
	{
		if(name.compareTo(student.name)<0)
			return -1;
		else if(name.compareTo(student.name)>0)
			return 1;
		else
			return 0;
	}
}
/*class Employee
{
	String eid;
	String name;
}*/
/*public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentss s1=new Studentss("123","praveen");
		Studentss s2=new Studentss("124","kumar");
		Studentss s3=new Studentss("125","anil");
		Studentss s4=new Studentss("126","balu");
		LinkedList ar=new LinkedList();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		ar.add(s4);
		System.out.println(ar);
		Collections.sort(ar);
		ar.forEach(System.out::println);
		Collections.reverse(ar);
		System.out.println("after reverse");
		ar.forEach(System.out::println);

		

	}

}*/
