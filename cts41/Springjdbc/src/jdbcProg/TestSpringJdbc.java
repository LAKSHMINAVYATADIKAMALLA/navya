package jdbcProg;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpringJdbc {

public static void main(String[] args) {
// TODO Auto-generated method stub
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationframework.xml");  
    
	   EmployeeDao dao=(EmployeeDao)ctx.getBean("edaoimpl"); 
	    
	    List<Employee> employee =dao.getEmployee();
		 
		Iterator<Employee> itr=employee.iterator();
		for(Employee e:employee)
		{
			System.out.println(e.getEname()+" " +e.getEmpid()+" "+e.getDept()+" "+e.getDesg()+"  "+e.getEmail());
		}
	
		dao.getEmployee();
}

}
