package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQB 
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("QBXml.xml");
		QuestionBank q1=(QuestionBank)context.getBean("qb");
		q1.showAnswers();
	}

}
