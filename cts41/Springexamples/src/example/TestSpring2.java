package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ApplicationContext context=new
				ClassPathXmlApplicationContext("beans2.xml");
		Person p=(Person) context.getBean("per");
		p.showData();
		
		Address a=(Address) context.getBean("addr");
		System.out.println(a);
	}

}   