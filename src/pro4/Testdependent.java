package pro4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Testdependent {
 
       public static void main(String[] args) 
       {
              // TODO Auto-generated method stub
              ApplicationContext cont=new ClassPathXmlApplicationContext("Dependentbean.xml");
              Person per=(Person)cont.getBean("per");
              per.show();
             
       }
 
}