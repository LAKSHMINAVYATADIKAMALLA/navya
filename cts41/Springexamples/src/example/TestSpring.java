package example;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestSpring {

	public static void main(String[] args) 
	{
		//ClassPathResource cps=new ClassPathResource("beans.xml");
			//XmlBeanFactory factory=new XmlBeanFactory(cps);
		
		ApplicationContext context=new
				ClassPathXmlApplicationContext("beans1.xml");
			
		ApplicationContext factory1 = new 
				FileSystemXmlApplicationContext("d://beans.xml");
		
				//HelloWorld obj=(HelloWorld) context.getBean("helloWorl;d");
		//obj.getMessage();
		//obj.display();
		//Students s=(Students) context.getBean("stu");
		Students s=(Students) factory1.getBean("stu");
		s.displayStudents();
		
		Human h=(Human) context.getBean("human");
		h.displayHuman();
		
	}
}
