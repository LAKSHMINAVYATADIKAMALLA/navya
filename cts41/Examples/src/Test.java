/*import java.util.function.Predicate;*/

//public class Test {


/*public static void main(String[] args)
{
	/*Predicate<Integer> p=I->(I>10);
	Predicate<Integer> p1=i->(i%2==0);
	Predicate<String> p2 =str->(str.length()>=3);
	Predicate<Integer> p3=i->{ boolean flag=true;
	Predicate<String>p5=str1->(str1.charAt(0)=='A');
	Predicate<Integer>p6=I->(i>=20);
	Predicate<Integer>p7=j->((j%2)==0);

	for(int x=2;x<i;x++)
	{
		if(i%x==0)
		{
			flag=false;
			break;
		}
	}
	return flag;
};
 		System.out.println(p.test(11));
 		System.out.println(p1.test(2));
 		System.out.println(p.test(2));
 		System.out.println(p1.test(11));
 		System.out.println(p6.test(11));
 		System.out.println(p7.test(11));


 		




}*/
	/*int[] x= {0,5,10,15,20,25,30};
	Predicate<Integer> p1=i->i>10;
	Predicate<Integer> p2=i->i%2==0;
	System.out.println("the number greate than 10:");
	m1(p1,x);
	System.out.println("the even numbers are");
	m1(p2,x);
	System.out.println("the numbers not greater than 10");
	m1(p1.negate(),x);
	System.out.println("the numbers not greater than 10and even are:");
	m1(p1.and(p2),x);
	System.out.println("the numbers not greater than 10 or even");
	m1(p1.or(p2),x);
}
public static void m1(Predicate<Integer>p,int[]x)
{
	for(int x1:x)
	{
		if(p.test(x1))
			System.out.println(x1);
	}*/
	
	/*class User
	{
		String uid;
		String pwd;
		public User(String uid,String pwd)
		{
			super();
			this.uid=uid;
			this.pwd=pwd;
		}
	}
	public class  Test {
		public static void main(String[]args)
		{
			User user1=new User("admin","1234");
			User user2=new User("Navya","Tadikamalla");
			Predicate<User> tuser=u->u.uid.equals("admin")&& u.pwd.equals("1234");
			if(tuser.test(user2))
				System.out.println("valid user..");
			else
				System.out.println("inalid user...");
					
		}

	
	public boolean equals(Object obj)
	{
		Employee e=(Employee)obj;
		if(desg.equals(e.desg)&& name.equals(e.name)&& salary.equals(e.salary)&&city.equals(e.city))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	Employee emp1=new Employee("Navya","Trainer",2344f,"hyd");
	Employee emp2=new Employee("hii","Trainer",2344f,"hyd");
	if(emp1.equals(emp2))

		}
	}
	}*/


