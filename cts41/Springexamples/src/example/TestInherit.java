package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInherit 
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("InheritBean.xml");
		InheritBean be=(InheritBean)context.getBean("be");
		
	}

}
