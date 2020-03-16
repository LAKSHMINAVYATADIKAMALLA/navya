package example;

public class Human 
{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void displayHuman()
	{
		System.out.println("Name of Human: "+name);
		System.out.println("Age of Human: "+age);
	}
}
