package pro4.copy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	
	 
	
	    public static void main(String[] args) 
	    {
	        ApplicationContext con=new ClassPathXmlApplicationContext("application.xml");
	        Mapp pp=(Mapp)con.getBean("pp");
	        pp.showAnswers();
	       
	 
	    }

	

}
