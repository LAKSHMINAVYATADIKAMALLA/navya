package example;

public class Address 
{
	String dno;
	String street;
	String city;
	Address(String dno, String street, String city) 
	{
		this.dno = dno;
		this.street = street;
		this.city = city;
	}
	public String toString() 
	{
		return "Address [dno=" + dno + ", street=" + street + ", city=" + city + "]";
	}
	
}
