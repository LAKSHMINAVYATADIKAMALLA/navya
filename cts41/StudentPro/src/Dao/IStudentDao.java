package Dao;

import java.util.List;

import Data.Student;

public interface IStudentDao 
{
	//THIS METHOD IS USED TO CREATE TO INSERT A RECORD IN TABLE
	public void create(Student student);
	//THIS METHOD IS USED TO RETRIEVE STUDENT
		//RECORD WITH GIVEN ID
	public Student getStudent(Integer id);
	//THIS METHOD IS USED TO LIST ALL STUDENT RECORDS
	public List<Student> getStudents();
	//
	public void delete (Integer id);
	//
	public void update(Student student);
	public boolean saveStudentByPst(final Student e);

}
