package main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dao.StudentDaoImpl;
import Data.Student;

public class TestStudent 
{
public static void main(String[] args)
{
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	StudentDaoImpl sdao=(StudentDaoImpl)context.getBean("edao");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter student id");
	int id=sc.nextInt();
	System.out.println("enter student name");
	String name=sc.next();
	System.out.println("enter student age");
	int age=sc.nextInt();
	Student student=new Student();
	student.setId(id);
	student.setName(name);
	student.setAge(age);
	sdao.create(student);
	
}
}
