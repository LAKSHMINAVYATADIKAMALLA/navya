package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QBMapTest {

public static void main(String[] args) {
// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("QBMap.xml");
QBMap q1=(QBMap)context.getBean("qb");
q1.showAnswers();
}

}
