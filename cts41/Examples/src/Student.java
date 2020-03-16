import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Consumer;
public class Student {
	String name;
	int marks;
	Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
}
class test
{
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Student> list=new ArrayList<Student>();
		Student s1=new Student("Praveen",80);
		Student s2=new Student("hello",80);
		Student s3=new Student("hii",80);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		Predicate<Student>p=s->s.marks>60;
		System.out.println(p.test(s1));
		Function<Student,String>f=s->
		{
			int marks=s.marks;
			if(marks>=80)
			{
				return "A[Dictinction]";
			}
			else if(marks>=60)
			{
				return "firstclass";
			}
			else if(marks>=40)
			{
				return "secondclass";
			}
			else
			{
				return "E[failed]";
			}
		};
		Consumer<Student> c=s->
		{
			System.out.println("Student Name"+s.name);
			System.out.println("Student Name"+s.marks);
			System.out.println("student Name"+f.apply(s));
			System.out.println();
		};
		for(Student s:list)
		{
			if(p.test(s))
				c.accept(s);
			
		}
		



	}
}	


