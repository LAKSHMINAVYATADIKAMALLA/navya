package prog3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main
{
	public static void main(String[] args) 
	{
	     AbstractApplicationContext context = new ClassPathXmlApplicationContext("Hello.xml");
	     HelloWorld a = (HelloWorld) context.getBean("helloWorld");
	     a.getMessage();
	     context.registerShutdownHook();
	  }

}

