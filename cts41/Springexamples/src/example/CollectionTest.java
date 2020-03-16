package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTest 
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Collection.xml");
		CollectionValues q1=(CollectionValues)context.getBean("qb");
		q1.showAnswers();
	}

}
