package example;

public class Person 
{
	String name;
	String age;
	Address address;
	Person(String name, String age, Address address) 
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public void showData()
	{
		System.out.println("Name:" +name);
		System.out.println("age:" +age);
		System.out.println("Address:" +address);
	}
}
