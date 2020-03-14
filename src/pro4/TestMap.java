package pro4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class TestMap {
 
       public static void main(String[] args) {
              // TODO Auto-generated method stub
              ApplicationContext cont=new ClassPathXmlApplicationContext("Dependentbean.xml");
              Mapp qump=(Mapp)cont.getBean("pp");
              qump.showAnswers();
 
       }
 
}
 