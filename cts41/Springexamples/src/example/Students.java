package example;

public class Students 
{
	String htno;
	String name;
	String branch;
	String clg;
	public String getHtno() {
		return htno;
	}
	public void setHtno(String htno) {
		this.htno = htno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() { 
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getClg() {
		return clg;
	}
	public void setClg(String clg) {
		this.clg = clg;
	}
	public void displayStudents()
	{
		System.out.println("Student Htno: "+htno);
		System.out.println("Student Name: "+name);
		System.out.println("Student Branch: " +branch);
		System.out.println("Student College: "+clg);
	}
	
	
}
