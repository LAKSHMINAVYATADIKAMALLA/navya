package Display;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringEmp
{
	public static void main(String[] args)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationframe.xml");  
	      
	   EmployeeDAOImpl dao=(EmployeeDAOImpl)ctx.getBean("edaoimpl"); 
	    
	    List<Employee> employee =dao.getEmployee();
		 
		Iterator<Employee> itr=employee.iterator();
		for(Employee e:employee)
		{
			System.out.println(e.getEname()+" " +e.getEmpid()+" "+e.getDept()+" "+e.getDesg()+"  "+e.getEmail());
		}
	
		dao.getEmployee();


	    
	
}




}






